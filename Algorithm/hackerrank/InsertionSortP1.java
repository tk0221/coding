import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
      
        int key;
        for(int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            int j;
            for(j=i-1; j>=0 && temp < ar[j]; j--) {
                ar[j+1] = ar[j];
                printArray(ar);
            }
            ar[j+1]=temp;                
        }
        printArray(ar);

    }

    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
