/*
  Author : Hoon Kim
  Description : Paint has fill function which fill the blank space.
  I assume only white and black in this code.   

  http://en.wikipedia.org/wiki/Flood_fill
*/

public class PaintFillFunction {

    private static final boolean T = true; //blank
    private static final boolean F = false;//filled
    //This is input boolean 2d array
   public static boolean[][] inputArray  = {{T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, F, F, F, T, T, T, T, T},
					    {T, T, F, T, F, T, T, T, T, T},
					    {T, T, F, T, F, T, T, T, T, T},
					    {T, T, F, F, F, T, T, T, T, T},
					    {F, F, F, F, F, F, F, F, F, F},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T}};
   public static boolean[][] inputArray1  = {{T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, F, F, F, T, T, T, T, T},
					    {T, T, F, T, F, T, T, T, T, T},
					    {T, T, F, T, F, T, T, T, T, T},
					    {T, T, F, F, F, T, T, T, T, T},
					    {F, F, F, F, F, F, F, F, F, F},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T},
					    {T, T, T, T, T, T, T, T, T, T}};
    

    public static void main(String[] args) {
    
	//x y coordinates
	printArray(inputArray, "Original");

	floodFill(inputArray, 3, 3);
	printArray(inputArray, "Click [3,3]");


	floodFill(inputArray1, 1, 1);
	printArray(inputArray1, "Click [1,1]");
	
	
    }

    public static void floodFill(boolean[][] input, int x, int y) {

	if(((x<0)||(x>=input.length))||((y<0)||(y>=input[x].length))){
	    //	    System.out.print("[A"+x+","+ y+"] ");
	}else if(input[x][y] == F){
	    //	    System.out.print("[B"+x+","+ y+"] ");
	}else if(input[x][y] == T){
	    //	    System.out.print("[C"+x+","+ y+"] ");
	    input[x][y] = F;
	    floodFill(input, x-1, y);
	    floodFill(input, x+1, y);
	    floodFill(input, x, y-1);
	    floodFill(input, x, y+1);
	}else{
	    System.out.println("???????????????");
	}
	


   }

    public static void printArray(boolean[][] input, String msg) {
	
	System.out.println(msg);
	for(int i =0 ; i <  input.length ; i++) {
	    for(int j =0 ;j < input[i].length; j++) {
		
		if(input[i][j] == F) 
		    System.out.print("#");
		else
		    System.out.print("_");
		
	    }
	    System.out.println();
	}
	System.out.println("\n");
    }

}