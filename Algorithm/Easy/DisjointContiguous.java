//http://www.careercup.com/question?id=19286747
//My Goal is O(n) algorithm

public class DisjointContiguous {
    
    static int[] arr2 = {4, -1, 7};
    static int[] arr3 = {-1, -2, -3};

    public static void main(String[] args){
//TEST1	
	int[] result = new int[arr1.length];
	System.out.print("[");
	for(int i =0; i<result.length ; i++){
	    System.out.print(arr1[i] + " " );
	    result[i] = returnDiff(arr1, i);
	}
	System.out.print("]   ");
	arrayPrinter(result);
//TEST2	
	int[] result2 = new int[arr2.length];
	System.out.print("[");
	for(int i =0; i<result2.length ; i++){
	    System.out.print(arr2[i] + " " );
	    result2[i] = returnDiff(arr2, i);
	}
	System.out.print("]   ");
	arrayPrinter(result2);
//TEST3
	int[] result3 = new int[arr3.length];
	System.out.print("[");
	for(int i =0; i<result3.length ; i++){
	    System.out.print(arr3[i] + " " );
	    result3[i] = returnDiff(arr3, i);
	}
	System.out.print("]   ");
	arrayPrinter(result3);
    }

    public static void arrayPrinter(int[] arr){
	int max =0, split = 0;
	for(int i = 0; i<arr.length ; i++){
	    
	    if(arr[i] > max) {
		max = arr[i];
		split = i;
	    }
	}
	

	System.out.println("   Split array :  " + split + " diff. : " + max);
    }

    public static int returnDiff(int[] arr,int split) {
	
	int left = 0, right = 0, tmp = 0 ;
	for (int i = 0 ; i < split ; i++) {
	    left += arr[i];
	}
	for (int i = split ; i < arr.length ; i++) {
	    right += arr[i];
	}

	//left = small value, right = bigger
	if(left>right){
	    tmp = left;
	    left=right;
	    right=tmp;
	} 
	//	System.out.println("l : " +left + " r : "+right +" split : "+ split); 
	if(((left>=0)&&(right>=0)) || ((left<=0)&&(right<=0))) {
	    return (right-left);
	}else{
	    return (right+(left*-1));
	}
	

	 
    }
}
