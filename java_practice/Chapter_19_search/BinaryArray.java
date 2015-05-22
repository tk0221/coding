import java.util.Random;
import java.util.Arrays;

public class BinaryArray {

    private int[] data;
    private static final Random generator = new Random();

    public BinaryArray( int size ) {
	data = new int[size];

	for(int i = 0 ; i < size ; i++) 
	    data[i] = 10 + generator.nextInt(90);

	Arrays.sort(data);
    }

    public int binarySearch(int target) {

	int low = 0;
	int high = data.length - 1;
	int middle = (low + high +1)/2;
	int location = -1;

	do {
	    System.out.print(remain(low, high));
	    for(int i = 0 ; i < middle ; i++)
		System.out.print("   ");
	    System.out.println(" * ");

	    if(target == data[middle])
		location = middle;

	    else if (target < data[middle])
		high = middle - 1;
	    else
		low = middle + 1;

	    middle = (low + high + 1) / 2;
	}
	while((low<=high) && (location == -1));

	return location;
    }

    public String remain(int low, int high) {
	StringBuilder tmp = new StringBuilder();

	for( int i = 0; i < low; i++)
	    tmp.append(" ");

	for(int i = low; i<=high; i++)
	    tmp.append(data[i]+" ");

	tmp.append("\n");
	return tmp.toString();
    }

    public String toString() {
	return remain(0, data.length -1);
    }
}
	
