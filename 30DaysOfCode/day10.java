import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ones = Integer.toBinaryString(n).split("[0]+");
        int max = 0;
        for (String s : ones) {
            if (s.length() > max)
                max = s.length();
        }
        
        System.out.println(max);
    }
}
