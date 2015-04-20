//Rotate a matrix 

public class RotateArray {
    
static    int[][] test1 = {{1,2,3,4,5,6,7,8,9},
		     {2,2,2,2,2,2,2,2,2},
		     {3,3,3,3,3,3,3,3,3},
		     {4,4,4,4,4,4,4,4,4},
		     {5,5,5,5,5,5,5,5,5}};
	
    public static void main(String[] args) {


	System.out.println("Roate test1 array");
	int[][] ret = rotate(test1);
	printer(ret);
	
	System.out.println("One more time");
	ret =	rotate(ret); //                  :?
	printer(ret);

    }
    public static int[][] rotate (int[][] input) {


	int[][] temp = new int[input[0].length][input.length];

	for(int r = 0 ; r < input.length;r++){
	    for(int c = 0 ; c < input[0].length;c++){
		temp[c][input.length-1-r] = input[r][c];
		//System.out.print("[r:"+r+" c:"+c+"::"+(test1.length-1-r)+"]");
	    }
	}
	    
	return temp;
    }
    public static void printer(int[][] temp) {

	for(int i = 0 ; i < temp.length ; i++) {
	    for(int j = 0 ; j <temp[0].length ; j++) {
		System.out.print(temp[i][j] + " " ) ;
	    }System.out.println();
	}
    }

}