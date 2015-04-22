//http://www.careercup.com/question?id=5727644228255744

public class SumBinary {

    public static String sumBinary(String s1, String s2) {
	
	char[] a, b;

	if(s1.length()>s2.length()){
	    a = s1.toCharArray();
	    b = s2.toCharArray();
	}else {
	    b = s1.toCharArray();
	    a = s2.toCharArray();
	}
	
	int length = s1.length() > s2.length() ? s1.length() + 1 : s2.length() + 1;
	char[] sum = new char[length];
	
	char c = '0';

	int i = s1.length() - 1, j = s2.length() - 1; //for looks code easy

	
	while( i>=0 ) {
	    if(a[i] == '0' && c == '0') {
		if(j<0) sum[i+1] = '0';
		else
		    sum[i+1] = b[j];
		
	    }else if(a[i] == '0' && c == '1') {
		if(j<0) {
		    sum[i+1] = '1';
		    c = '0';
		}else if(b[j] == '0') {
		    sum[i+1] = '1';
		    c = '0';
		}else{
		    sum[i+1] = '0';
		    c = '1';
		}
		
	    }else if(a[i] == '1' && c == '1') {
		if(j<0) {
		    sum[i+1] = '0';
		    c = '1';
		}else if(b[j] == '0') {
		    sum[i+1] = '0';
		    c = '1';
		}else{
		    sum[i+1] = '1';
		    c = '1';
		}
		
		
	    }else if(a[i] == '1' && c == '0') {
		if(j<0) {
		    sum[i+1] = '1';
		    //c == '0';
		} else if(b[j] == '0') {
		    sum[i+1] = '1';
		}else {
		    sum[i+1] = '0';
		    c='1';
		}
		
	    }

	    
	    

	    i--;
	    j--;
	}
	
	if(c == '1') sum[0] = '1';
	//	System.out.println(sum);

	return new String(sum); // or return sum?
    }

    public static void main(String[] args) {


        System.out.println(sumBinary("", ""));
        System.out.println(sumBinary("0", "0"));
        System.out.println(sumBinary("1", "1"));	
        System.out.println(sumBinary("0111101", "0001101"));
	System.out.println(sumBinary("1111", "0000"));
	System.out.println(sumBinary("1010", "0101"));
	System.out.println(sumBinary("1111", "1111"));

	System.out.println(sumBinary("1111", ""));
	
	System.out.println(sumBinary("1111", "1"));
	
	System.out.println(sumBinary("1111", "00"));
	
	System.out.println(sumBinary("1111111111111111", "111"));

	
    }
    
}
