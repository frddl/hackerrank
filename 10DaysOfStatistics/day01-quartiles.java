import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();
    Arrays.sort(a);

    int mid = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        
    System.out.println(median(Arrays.copyOfRange(a, 0, n / 2)));
    System.out.println(median(Arrays.copyOfRange(a, 0, n)));
    System.out.println(median(Arrays.copyOfRange(a, mid, n)));
}

    static int median(int[] arr) {
        return (arr.length % 2 == 1) ? arr[arr.length/2] : (arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
    }
}
    
