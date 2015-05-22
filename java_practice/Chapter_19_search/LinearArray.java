import java.util.Random;
import java.util.Arrays;

public class LinearArray {
    private int[] data;
    private static final Random generator = new Random();

    public LinearArray(int size) {

	data = new int[size];
	for(int i = 0; i < size; i++)
	    data[i] = 10 + generator.nextInt(90);
    }

    public int linearSearch(int searchKey) {

	for(int i = 0; i < data.length; i++)
	    if(data[i] == searchKey)
		return i;

	return -1;
    }

    public String toString() {
	return Arrays.toString(data);
    }



}
