import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
                
        System.out.println(bj(a) ? "YES" : "NO");
    }
    
    static boolean bj(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++)
            if (a[i] == a[i+1]) return false;
        return true;
    }
}
