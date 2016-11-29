import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
        boolean flag = true;
        
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        
        for (int i = 0; i < a.length; i++)
            if ((a[a[i]-1] != i+1))
                flag = false;
            
        System.out.println(flag ? "YES" : "NO");
    }
}
