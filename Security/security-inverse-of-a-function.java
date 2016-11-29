import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n], indexes[] = new int[n];
        
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
            indexes[i] = i + 1;
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i; j++){
                if (nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    temp = indexes[j-1];
                    indexes[j-1] = indexes[j];
                    indexes[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++)
            System.out.println(indexes[i]);
        
    }
}
