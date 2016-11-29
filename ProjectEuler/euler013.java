import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger sum = new BigInteger("0");
        
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
            sum = sum.add(in.nextBigInteger());
            
        System.out.print(sum.toString().substring(0,10));        
    }
}
