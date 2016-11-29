import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String shift(String s, int n){
        if (n == 0) return s + "";
        else {
            String r = "";
            for (int i = 0; i < s.length(); i++)
                r += ((s.charAt(i)) == '9') ? 0 : (Character.getNumericValue(s.charAt(i)) + 1);
                
            n--;
            return shift(r,n);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "" + in.nextLine();      
        int n = in.nextInt();
        System.out.print(shift(s,n));
    }
}
