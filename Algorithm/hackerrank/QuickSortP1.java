import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
                    
              int[] a = new int[ar.length];
              int p = 0, key = ar[0];
              int l = 0, r = ar.length - 1;
              for(int i = 1 ; i < ar.length ; i++){
                  if(ar[i] < key) 
                      a[l++] = ar[i];
                  else
                      a[r--] = ar[i];
              }
              a[r] = key;
              printArray(a);
              
              
              
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
