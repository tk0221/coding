
public class MyMergeSort {


    public static void main(String[] args) {

	System.out.println("Merge Sort Alg");

	int[] test1 = {99, 50, 20, 40, 30, 10, 5, 3, 1};

	System.out.println("Before");
	for(int i : test1) System.out.printf("%d ", i);
	System.out.println();
	int[] sorted1 = mergeSort(test1, 0, test1.length - 1);

	System.out.println("After");
	
	for(int i : sorted1) System.out.printf("%d ", i);
	System.out.println();
	
	
	
    }

    public static int[] mergeSort(int[] array, int low, int high) {

	if(low < high) {
	    int mid = (low+high)/2;
	    mergeSort(array, low, mid);
	    mergeSort(array, mid+1, high);
	   return  merge(array, low, mid, high);

	}
	
	return array;
    }

    public static int[]  merge(int[] array, int l, int m, int h){

	int[] helper = new int[array.length];
	for(int i = l; i<=h; i++)
	    helper[i] = array[i];

	int helperLeft = l;
	int helperRight = m + 1;
	int current = l;

	while(helperLeft <= m && helperRight <= h){
	    if(helper[helperLeft] <= helper[helperRight]){
		array[current] = helper[helperLeft];
		helperLeft++;
	    }else{
		array[current] = helper[helperRight];
		helperRight++;
	    }
	    current++;
	}
	int remaining = m - helperLeft;
	for(int i =0; i <= remaining; i++){
	    array[current+i] = helper[helperLeft + i];
	}
	
	return array;    
    }
	

}



