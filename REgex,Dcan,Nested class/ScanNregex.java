
package regaxandother;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ScannAndRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {            
        System.out.print("Enter full text : ");
        String pt1 = input.nextLine();
        
        System.out.print("Enter Regex : ");
        String expresstionn = input.nextLine();
        
        //creating a pattern obj 
       Pattern patternObj = Pattern.compile(expresstionn);
       // regex -> FullStr
       Matcher matchObj = patternObj.matcher(pt1);

        System.out.println(pt1.matches(".*"+expresstionn+".*")); 
        }
        
    }
  
}
