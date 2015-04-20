/*
  http://ideone.com/FlSg8E
  SenariO : Two merged array is input and output will be one single merged array.
  Author : Hoon Kim
*/
public class Merge {
    public static void main(String[] args) {

	int[] a1 = {};
	int[] a2 = {1};
	int[] a3 = {2,4,6,8};
	int[] a4 = {1,3,4,7};
	int[] a5 = {1,2,3,90,91,92};
	int[] a6 = {11,13,15,16};

	merge(a1, a1);
	merge(a1, a2);
	merge(a2, a5);
	merge(a3, a6);
	merge(a4, a1);
	merge(a5, a2);
	merge(a2, a5);
	merge(a1, a1);
	merge(a5, a5);
    }

    public static void merge(int[] arr1, int[] arr2) {
	
	int i = 0, j = 0;
	int[] result = new int[arr1.length + arr2.length];
	while(i<arr1.length && j<arr2.length) {
	    if(arr1[i]<arr2[j]){
		result[i+j] = arr1[i++];
	    } else {	
		result[i+j] = arr2[j++];
	    }
	}

	if(j < arr2.length) {
	    while(j != arr2.length) {
		result[i+j] = arr2[j++];
	    }
	}else{
	    while(i != arr1.length) {
		result[i+j] = arr1[i++];
	    }
	}
	
	for (int e : result){
	    System.out.print(e + " ");
	}
	System.out.println();
    }
}

