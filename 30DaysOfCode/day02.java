import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        mealCost += mealCost*tipPercent/100 + mealCost*taxPercent/100;
        int totalCost = (int) Math.round(mealCost);
        
        System.out.print("The total meal cost is " + totalCost + " dollars.");
    }
}
