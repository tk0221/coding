

public class QuickSort {

    private static int[] array;

    public static void main(String[] args) {


	System.out.println("QuickSort");

	System.out.println("Before");
	int[] testArr = {99, 98, 1, 2, 10, 30, 20, 50, 40};
	for(int i : testArr) System.out.printf("%d ", i);
	System.out.println();

	
	array = testArr;

	qs(array, 0, array.length - 1);

	for(int i : array) System.out.printf("%d ", i);
	System.out.println();
	

	
    }

    public static void qs(int[] arr, int l, int r){

	int index = partition(arr, l, r);//

	if(l < index - 1) qs(arr, l, index - 1);//
	if(index < r) qs(arr, index, r);

	
    }

    public static int partition(int[] arr, int l, int r) {
	int p = arr[(l+r)/2];
	while(l<=r) {
	    while(arr[l]<p) l++;
	    while(arr[r]>p) r--;//
	    if(l<=r){
		swap(arr, l, r);
		l++;r--;
	    }
	}
	return l;
    }

    public static void swap(int[] arr, int l, int r) {
	int tmp = arr[l];
	arr[l] = arr[r];
	arr[r] = tmp;

    }
    
}
