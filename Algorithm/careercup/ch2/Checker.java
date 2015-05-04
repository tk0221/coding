class Checker {

    public static void main(String[]  args) {

	System.out.println("Unique chars check");

	String test1 = "abcdefga";

	if(isUniqueChars2(test1)){
	    System.out.println("test1 is Unique string");
	}else
	    System.out.println("test1 is not Unique string");


	if(isUniqueChars(test1)){
	    System.out.println("test1 is Unique string");
	}else
	    System.out.println("test1 is not Unique string");
	
	
    }

    public static boolean isUniqueChars2(String str) {


	if(str.length() > 256) return false;
	
	boolean[] char_set = new boolean[256];
	for( int i = 0; i < str.length(); i++ ) {
	    int val = str.charAt(i);
	    if(char_set[val]) return false;
	
	    char_set[val] = true;
	}
	return true;
	
    }

    public static boolean isUniqueChars(String str){
	if(str.length() > 256) return false;

	int checker = 0;
	for(int i = 0; i < str.length(); i++) {
	    int val = str.charAt(i) - 'a';
	    int tmp = (checker & (1 << val));
	    System.out.printf("%c\t%d\n", str.charAt(i), tmp);
	    if(tmp > 0) return false;
	
	checker |= (1<<val);
	}
	return true;
    }
    
}

    
