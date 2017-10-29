 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minmax {
 public static long getMax(int[] inputArray){ 

   
  Arrays.sort(inputArray);
  
    long sum=0;
     for(int i=1;i<inputArray.length;i++){
              sum=sum+inputArray[i];
          }return sum; }
 
 public static long getMin(int[] inputArray){ 

   
  Arrays.sort(inputArray);
  
    long sum=0;
     for(int i=0;i<(inputArray.length-1);i++){
              sum=sum+inputArray[i];
          }return sum; }
    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            
         
        }
         long max =getMax(arr);
         long min = getMin(arr);
          System.out.println(min+" "+max);
    }
}
