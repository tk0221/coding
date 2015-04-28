import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int[] a = new int[test];
        for(int i = 0 ; i < test ; i++) {
            a[i] = in.nextInt();
        }
        int cnt = 0;
        for(int i = 1 ; i < test ; i++){
            int next = a[i];
            int j = i;
            while(j>0 && a[j-1] > next){ // !!!(a[0] > a[1])
                a[j] = a[j-1];
                j--;
                cnt++;
            }
            a[j] = next;
            
        }
        System.out.println(cnt);
        
        
    }
}
