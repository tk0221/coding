// www.careeercup.com/question?id=16759664

// Input 3 sorted list, Output : find smalledst range that includes at least one number from
// each of the k lists

//Done Oct. 8, 2013 3:45AM
public class SmallestRange {
    
    static int[] list1 = {4, 10, 15, 24, 26};
    static int[] list2 = {0, 9, 12, 20};
    static int[] list3 = {5, 18, 22, 30};

    public static void main(String[] args) {

	findMinRange(list1, list2, list3);
    }

    public static void findMinRange(int[] a, int[] b, int[] c){

	int i = 0, j = 0, k = 0;

	int min = 999; // i could put list1[list1.length-1] + list ... but just make it simple
	int t1=0,t2=0,t3=0,tmp=0;
	while(i<a.length&&j<b.length&&k<c.length){
	    tmp = calRange(a[i],b[j],c[k]);
	    if(min>tmp){
		min = tmp;
		t1 = a[i]; t2 = b[j]; t3 =c[k];
	    }
	    switch(returnSmallIndex(a[i],b[j],c[k])){
		case 1 : i++;
		    break;
		case 2 : j++;
		    break;
		case 3 : k++;
		    break;
	    }

	    

	}
    

	System.out.println("Smallest Range is [" +t1+", "+t2+", "+t3+"]");
    }
    public static int calRange(int a, int b, int c){

	int max = Math.max(a, Math.max(b,c));
	int min = Math.min(a, Math.min(b,c));
	return max - min;

    }
    public static int returnSmallIndex(int a, int b, int c){

	int tmp = Math.min(a, Math.min(b,c));
	if(tmp == a) return 1;
	else if(tmp == b) return 2;
	else return 3;
    }
}
