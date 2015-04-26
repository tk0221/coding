import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        char[] array = new char[100000];
        int cnt = 0;
        char current;
        while(test>0){
            
            array = in.next().toCharArray();
            current = array[0];
            for(int i = 1; i < array.length; i++){
                if(current != array[i]) {
                    current = array[i];
                }else cnt++;
            }
            
            System.out.println(cnt);
            cnt = 0;
            --test;
        }
        
        
        
    }
}
