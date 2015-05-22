import java.util.Scanner;

public class BinarySearchTest {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int key;
	int pos;

	BinaryArray searchArray = new BinaryArray(15);
	System.out.println(searchArray);


	System.out.print("Input :");
	key = input.nextInt();
	System.out.println();

	while(key != -1) {
	    pos = searchArray.binarySearch(key);

	    if(pos == -1)
		System.out.println("The integer " + key + "was not found.\n");
	    else
		System.out.println("The integer " + key + "was found in pos " + pos + "\n");
	    key = input.nextInt();
	    System.out.println();
	}
    }

}
	    
