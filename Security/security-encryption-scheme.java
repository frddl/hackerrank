import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt(), a = 1, p = n;
        
        for (;;){
            a *= n;
            n--;
            if (n == 0) break;
        }
        
        System.out.print(a);
    }
}
