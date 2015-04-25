import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int gap = r - l;
        int max = 0;
        int xor = 0;
        for(int a = l; a < r; a++) {
            for(int b = 1; b <= gap; b++) {
                if(a+b<=r){
                    xor = a ^ (a+b);
                    max = max > xor ? max : xor;
                }
            }
            
        }
        
        return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
