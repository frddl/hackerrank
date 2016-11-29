import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String prime(int n){
        if (n == 1) return "Not prime";
        
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return "Not prime";
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        for (int i = 0 ; i < j; i++){
            System.out.println(prime(in.nextInt()));
        }
    }
}
