
package housetesting;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HouseTesting {

    
    
    
    public static void main(String[] args) {
        
        Runnable task_1 = ()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
         System.out.println("Task one is running");
          System.out.println("Task_1");
                 
        };
        
        Runnable task_2 = ()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
         System.out.println("Task @2 is running");
          System.out.println("Task_2");
                 
        };
        Runnable task_3 = ()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
         System.out.println("Task threee is running");
          System.out.println("Task_3");
                 
        };
        Thread task_01 = new Thread(task_1);
        Thread task_02 = new Thread(task_2);
        Thread task_03 = new Thread(task_3);
        task_01.start();
        task_02.start();
        task_03.start();
        
        
    }
    
}
