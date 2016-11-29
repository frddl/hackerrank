import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){

        final String regex = "(?:\\s?)((?:(?:[\\\"\\'].*?(?:[\\.?!][\\\"\\'](?:\\s[a-z].*?[\\.?!])?|[\\\"\\'].*?[\\.?!]))|(?:[^.?!\\\"]{2,1000}[\\.?!]?)))";
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        
        while (matcher.find()) {
          System.out.println(matcher.group(1));   
        }
    }
}
