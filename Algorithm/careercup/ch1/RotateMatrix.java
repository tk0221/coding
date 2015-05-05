public class RotateMatrix {


    public static void main(String[] args) {


	System.out.println("Rotating Matrix");

	int[][] m1= {{1,1,1,1,2},
		     {4,5,5,6,2},
		     {4,8,9,6,2},
		     {4,8,7,7,2},
		     {4,3,3,3,3,}};
	System.out.println("Original\n");
	printMatrix(m1);
	rotate(m1);


	int[][] m11 = {{1,1,1,1,1,1,1,1,1,1,2},
		       {2,3,3,3,3,3,3,3,3,5,2},
		       {2,5,1,1,1,1,1,1,9,5,2},
		       {2,5,9,8,8,8,8,1,9,5,2},
		       {2,5,9,1,6,6,0,1,9,5,2},
		       {2,5,9,1,0,7,0,1,9,5,2},
		       {2,5,9,1,0,6,6,1,9,5,2},
		       {2,5,9,1,8,8,8,8,9,5,2},
		       {2,5,1,1,1,1,1,1,9,5,2},
		       {2,5,3,3,3,3,3,3,3,3,2},
		       {2,1,1,1,1,1,1,1,1,1,1}};
		       
		       
	//	System.out.println(m11);
	printMatrix(m11);

	rotate(m11);


	
    }

    public static void rotate(int[][] m) {

	int tmp; //using 1 memory
	int limit = m.length/2;
	int l = m.length-1;
	for(int i = 0; i < limit; i++) { // i is like layer
	    for(int j = i; j < l-i ; j++) {
		//backup Top
		tmp = m[i][j];
		
		//TOP   <-- LEFT
		m[i][j] = m[j+1][i];
		
		//LEFT <-- BOT   OK
 		m[j+1][i] = m[l-i][l-j];


		//BOT <- RIGHT
		m[l-i][l-j] = m[j][l-i]; 
		//RIGHT <-TOP
		m[j][l-i] = tmp;
		
	    }

	    //   printMatrix(m);
	    
	}
	
	printMatrix(m);

	
    }
    
    public static void printMatrix(int[][] m) {

	//n x n matrix

	for(int i = 0; i < m.length; i++) { 
	    for(int j = 0; j < m[0].length; j++) {
		System.out.printf("%d ", m[i][j]);
	    }
	    System.out.println();
	}
	System.out.println();
	
    }

    
}
