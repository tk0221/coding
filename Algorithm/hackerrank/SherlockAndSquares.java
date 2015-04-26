import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

    while(test > 0) {
        int a = (int) (Math.ceil(Math.sqrt(s.nextInt())));
        int b = (int) (Math.floor(Math.sqrt(s.nextInt())));

        System.out.println(b - a + 1);

        --test;
    }
    }
}
