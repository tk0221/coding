class Permutation {


    public static void main(String[] args) {


	String test = "I am a boy";
	String sorted = sort(test);

	System.out.println(test);
	
	System.out.println(sorted);
	
	if(permutation(test, sorted)) {
	    System.out.println("same permutation");
	}else{
	    System.out.println("diff permutation");
	}
	
    }

    public static String sort(String s) {

	char[] content = s.toCharArray();
	java.util.Arrays.sort(content);
	return new String(content);
    }


    public static boolean permutation(String s, String t) {

	if(s.length()!=t.length()) {
	    return false;
	}
	return sort(s).equals(sort(t));
	
    }

    
}
