// previous code takes more than O(n), however this solution will take O(n)

// Author : Hoon Kim

public class DisjointContiguous2 {
    
    static int[] arr1 = {-1, -2, 1, -4, 2, 8};
    static int[] arr2 = {4, -1, 7};
    static int[] arr3 = {-1, -2, -3};

    public static void main(String[] args) {

	int[] result1 = calc(arr1);
	System.out.println("Array1 diff : " + result1[0] + " split : " + result1[1]);
    	int[] result2 = calc(arr2);
	System.out.println("Array2 diff : " + result2[0] + " split : " + result2[1]);
    	int[] result3 = calc(arr3);
	System.out.println("Array1 diff : " + result3[0] + " split : " + result3[1]);
    
    }

    public static int[] calc(int[] input) {
	int[] result = {0,0}; //first is value second is split 

	int l = 0, r = 0;

	for(int i = 0 ; i < input.length ; i++){
	    r += input[i];
	}

	for(int i = 0 ; i < input.length ; i++){
	    l += input[i];
	    r -= input[i];
	    
	    if(result[0]<diff(l,r)) {
		result[0] = diff(l,r);
		result[1] = i + 1; // input[0] is first element
	    }
	    
	}
	
	return result;
    }
    public static int diff(int l, int r) {
	int result = 0;
	if(l>r) { //swap 
	    result = r;
	    r = l;
	    l = result;
	}
	//Get diff
	if(((l>=0)&&(r>0))||((l<0)&&(r<=0))) {
	    result = r - l;
	}else{
	    result = r - l;
	}	
	return result;
    }
}
