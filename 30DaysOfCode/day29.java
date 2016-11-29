import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(), k = in.nextInt(), max = 0;
            for (int i = 1; i < n ; i++)
                for (int j = i+1; j < n+1 ; j++){
                    int v = i&j;
                    if (v < k && v > max)
                        max = v;
                }
        
            System.out.println(max);
        }
    }
}
