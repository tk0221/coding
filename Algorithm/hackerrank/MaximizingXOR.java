import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int palindromic(String str) {
        
        int result = 0;
        int cmp = str.length();
        
        for(int i = 0; i < cmp/2; i++ ) {
                result +=  Math.abs( (int)str.charAt(cmp - 1 - i) - (int)str.charAt(i));
                
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            System.out.println(palindromic(in.next()));
            t--;
        }
    }
}
