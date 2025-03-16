
package LambdaInJava;

import java.util.ArrayList;
import java.util.Arrays;

interface Study{
  void Biology();
  // void Result(); -- cannopt have more
}



public class Lambda {
    public static void main(String[] args) {
        // loading interface method in lambda and then 
        Study method_1 = ()-> System.out.println("Biology is op");
        Study method_2 = ()-> System.out.println("english is op");
        Study method_3 = ()-> System.out.println("Bangla is op");
        
        RunTheLambda(method_1);
        RunTheLambda(method_2);
        method_3.Biology();
        
        //-----------------other example----------
        ArrayList<Integer> totalmarks = new ArrayList<>(Arrays.asList(1,22,44,55,232,12,67,33,2,3,4,5,10));
        totalmarks.forEach((a)-> {System.out.println("num is "+ a);});
        
        
    }

    private static void RunTheLambda(Study method) {
        method.Biology();
        }
    }

