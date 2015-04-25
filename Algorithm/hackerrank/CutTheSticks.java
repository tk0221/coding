import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void cut(int[] a) {
        
        int remain = a.length;
        boolean flag = true;
        while(remain>0){
            if(flag) System.out.println(remain);
            flag = false;
            for(int i = 0; i < a.length; i++) {
                a[i]-=1;
                if(a[i]==0) {flag = true; remain--;}
            }
            
        }
        
    }  
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] a = new int[s];
        for(int i = 0 ; i < s ; i++) a[i] = in.nextInt();
    
        cut(a);
    }
}
