import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int calc( int  n) {
        int lp = n/2;
        int h = 1;
        while(lp>0){
            h = h*2+1;
            lp--;
        }
        return n%2==0?h:h*2;
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
