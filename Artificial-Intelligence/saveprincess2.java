import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void nextMove(int n, int x, int y, String [] grid){
        int px = 0, py = 0;
        for (int i = 0; i < n; i++)
            if (grid[i].contains("p")){
                px = i;
                py = grid[i].indexOf("p");
                break;
            }
        
        if (x == px)
            if (y > py)
                System.out.print("LEFT");
            else
                System.out.print("RIGHT");
        else if (y == py)
            if (x > px)
                System.out.print("UP");
            else
                System.out.print("DOWN");
        else
            if (Math.min(Math.abs(px-x), Math.abs(py-y)) == Math.abs(px-x))
                if (x > px)
                    System.out.print("UP");
                else
                    System.out.print("DOWN");
                else 
                    if (y > py)
                        System.out.print("LEFT");
                    else
                        System.out.print("RIGHT");
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), r = in.nextInt(), c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];

        for (int i = 0; i < n; i++)
            grid[i] = in.next();

        nextMove(n,r,c,grid);
    }
}
