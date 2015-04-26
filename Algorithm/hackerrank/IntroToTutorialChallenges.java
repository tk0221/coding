import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int target = in.nextInt();
        int size = in.nextInt();
        
        for(int i = 0 ; i < size ; i++) {
            if(in.nextInt() == target) {
                System.out.println(i);
                break;
            }
        }
    
    
    }
}
