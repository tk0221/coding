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
	if (s.length() != t.length()){
	    return false;
	}

	int[] letters = new int[256];

	char[] s_array = s.toCharArray();
	for(char c : s_array) {
	    letters[c]++;
	}

	for(int i = 0; i < t.length(); i++) {
	    int c = (int) t.charAt(i);
	    if(--letters[c] < 0) {
		return false;
	    }
	}

	return true;


	
    }

    
}
