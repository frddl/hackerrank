import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), myX = 0, prX = 0, myY = 0, prY = 0;
        String moves = "", dash = "";
        
        for (int i = 0; i < m; i++)
            dash += "-";
    
        for (int i = 0; i < m; i++) {
            String temp = in.next();
            if (!temp.equals(dash))
                if (temp.contains("m")) {
                    myY = temp.indexOf("m");
                    myX = i;
                }
                
                else if (temp.contains("p")) {
                    prY = temp.indexOf("p");
                    prX = i;
                }
        }
        
        for (int i = 0; i < Math.abs(myX - prX); i++)
            if (myX < prX) 
                moves += "DOWN\n";
            else 
                if (myX > prX) 
                    moves += "UP\n";
        
        for (int i = 0; i < Math.abs(myY - prY); i++)
            if (myY < prY) 
                moves += "RIGHT\n";
            else 
                if (myY > prY) 
                    moves += "LEFT\n";
        
        System.out.print(moves);
    }
}
