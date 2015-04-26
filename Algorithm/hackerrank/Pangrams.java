import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        char[] a = in.nextLine().toUpperCase().toCharArray();
        //A is 65 Z 90 = 26 char 
        boolean[] array = new boolean[26];

        for(int i = 0; i < a.length; i++) {
            if((int)a[i]<=90 && (int)a[i]>=65)
                array[(int)a[i]-65] = true;        
        }
        
        if(areAllTrue(array)) System.out.println("pangram");        
        else System.out.println("not pangram");

    }   
    
    public static boolean areAllTrue(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }
}
