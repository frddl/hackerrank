import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String s = "" + (new Scanner(System.in)).nextLine();      
        for (int i = 0; i < s.length(); i++)
            System.out.print(((s.charAt(i)) == '9') ? 0 : (Character.getNumericValue(s.charAt(i)) + 1));
    }
}
