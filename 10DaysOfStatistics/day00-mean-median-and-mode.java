import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        
        Arrays.sort(arr);
        
        double mean = 0;
        for (int i = 0; i < arr.length; i++)
            mean += arr[i];
        mean /= arr.length;
        System.out.println(String.format("%.1f", mean));
        
        double median = 0;
        median = (arr.length % 2 == 1) ? arr[arr.length/2] : ((double) arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
        System.out.println(median);
        
        double mode = arr[0];
        int maxocc = 0;
        
        for (int i = 0; i < arr.length; i++){
            int c = 0;
            for (int k = 0; k < arr.length; k++)
                if (arr[i] == arr[k])
                    c++;

                if (maxocc < c){
                    maxocc = c;
                    mode = arr[i];
                }
        }
        
        System.out.println((int)mode);
    }  
}
