import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 1; i <= n; i++){
                a[i-1] = i;
            }
            
            System.out.println(lcm(a));
        }
    }
    
    private static long gcd(long a, long b){
        while (b > 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input){
        long result = input[0];
        for (int i = 1; i < input.length; i++) 
            result = lcm(result, input[i]);
        return result;
    }
}
