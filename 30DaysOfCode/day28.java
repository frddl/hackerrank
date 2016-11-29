import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s[] = new String[N];
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            s[a0] = (emailID.substring(emailID.length()-10).equals("@gmail.com")) ? firstName : "";
        }
        
        Arrays.sort(s);
        
        for (int j = 0; j < N; j++)
            if (s[j] != "")
                System.out.println(s[j]);
    }
}
