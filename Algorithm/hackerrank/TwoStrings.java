import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        while(test>0){
            boolean[] check = new boolean[26];
            boolean p = false;
            char[] arr1 = in.next().toLowerCase().toCharArray();
            char[] arr2 = in.next().toLowerCase().toCharArray();
            for(int i = 0; i < arr1.length; i++) {
            //    System.out.println((int)arr1[i] - 97);
              check[(int)arr1[i]-97] = true;  
            }
            for(int i = 0; i < arr2.length; i++){
                if(check[(int)arr2[i]-97]) p = true;
                
            }
            
            if(p) System.out.println("YES");
            else System.out.println("NO");
            --test;
        }
        
    
    
    }
}
