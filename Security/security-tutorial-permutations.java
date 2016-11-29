import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        
        for (int i = 0; i < a.length; i++)
            System.out.println(a[a[i]-1]);
    }
}
