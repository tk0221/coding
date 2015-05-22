import java.util.Scanner;

public class LinearSearchTest {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int searchInt;
	int position;

	LinearArray searchArray = new LinearArray(10);
	System.out.println(searchArray+"\n");

	System.out.print("Please enter an integer value (-1 to quit): ");
	searchInt = input.nextInt();

	while(searchInt != -1) {
	    position = searchArray.linearSearch(searchInt);

	    if(position == -1)
		System.out.println("Not found");
	    else
		System.out.println("The integer" + searchInt +
				   "was found in position " + position + ".\n");


	    searchInt = input.nextInt();
	}
    }
}
