import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[100];//0~99
        
        for(int i = 0; i < size; i++){
            a[i] = in.nextInt();
            in.next();
            b[a[i]]++;
            
        }
          int result = 0;
        for(int i = 0; i < 100; i++){
           
            result +=b[i];
            System.out.printf("%d ", result);
            
            
        }
    
    
    }
}
