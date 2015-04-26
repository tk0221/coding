import java.io.*;
import java.util.*;

public class Solution {

    
    public static void eval(char[] in){
        for(int i = 0; i < in.length / 2; i++) {
     if( (Math.abs((int)in[i] - (int)in[i+1])) != (Math.abs((int)in[in.length - i - 1] - (int)in[in.length - i - 2])))      {
                System.out.println("Not Funny");
         return;
            }
            
        }
        System.out.println("Funny");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test>0){
           eval(in.next().toCharArray());
          
            --test;
        }
    
    
    }
}
