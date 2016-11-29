import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()], b = new int[a.length];
        
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        
        for (int i = 0; i < b.length; i++)
            b[i] = in.nextInt();
        
        double w = 0;
        for (int i = 0; i < a.length; i++)
            w += a[i] * b[i];
        
        int sum = 0;
        for (int i = 0; i < b.length; i++)
            sum += b[i];
        
        System.out.print(String.format("%.1f" , w/sum));
    }
}
