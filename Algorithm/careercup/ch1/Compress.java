public class Compress {

    public static void main( String[] args) {

	String test = "aaabbbcccdddeeeabcdaabbccdd";
	System.out.println("Compress String Demo");

	System.out.println(test);
	String result = compress(test);
	System.out.println(result);
	
    }

    public static String compress(String s){

	if(s == null) return "";

	String result = "";
	char last = s.charAt(0);
	int count = 1;
	    
	for(int i = 1; i < s.length(); i++){
	    if(last == s.charAt(i)){
		count++;
	    }else{
		result += last+"" + count;
		count = 1;
		last = s.charAt(i);

	    }
	    
	}
	return result;
    }
}
