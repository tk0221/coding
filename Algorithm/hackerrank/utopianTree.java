import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int calc( int  n) {
        if(n==0) return 1;
        else if(n==1) return 2;
            
        int loop = n/2;
        int h = 1;
        while(loop>0){
            h = h*2+1;
            loop--;
        }
        if(n%2==1) h=h*2;
        return h;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cycle = in.nextInt();
        
        for(int i = 0 ; i < cycle ; i++){
            int n = in.nextInt();
            System.out.println(calc(n));         
        }
    }
}
