
package januarysabbish;

import static januarysabbish.Januarysabbish.noModifer;
import static januarysabbish.Januarysabbish.x;
import static januarysabbish.Januarysabbish.y;


public class Januarysabbish {

   public static int x= 10;
   protected static  int y=20;
   
    public  int xxx= 10;
   protected  int yyy=20;
    static int noModifer = 100;
   
   // only same class..
   private static int z =30;
   
    public static void main(String[] args) {
        System.out.println("sdsds");
    }
    

    
    
}
class innerClass{
        public static void main(String[] args) {
            // yes...
            System.out.println(x);
            System.out.println(y);
            System.out.println(noModifer);
            
            Januarysabbish nonstatic = new Januarysabbish();
            
            System.out.println(nonstatic.xxx);
            System.out.println(nonstatic.yyy);
           // error....
           //  System.out.println(z);
        }
    }
