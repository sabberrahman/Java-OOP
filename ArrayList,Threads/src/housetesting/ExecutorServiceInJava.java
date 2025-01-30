




import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInJava {
    public static void main(String[] args) {
       ExecutorService exc = Executors.newFixedThreadPool(2);
       
       Runnable task_1 = ()->{
           System.out.println("Task one is running");
       };
       Runnable task_2 = ()->{
           System.out.println("Task two  is running");
       };
               
        exc.submit(task_2);
        exc.close();
    }
}