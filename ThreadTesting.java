
package housetesting;

package thursday;
/**
 *
 * @author sabber
 */
public class ThreadGRoupNPrioirty {
    public static void main(String[] args) {
        ThreadExtendted thread1 = new ThreadExtendted("task->1");
         ThreadExtendted thread2 = new ThreadExtendted("task ->2");
         thread2.setPriority(1);
         thread1.setPriority(10);
         thread1.start();
         thread2.start();
         
         
         //group
         ThreadGroup group = new ThreadGroup("ThreadGroup::1");
         ThreadExtendtedWgroup thread4 = new ThreadExtendtedWgroup(group,"task->4");
         ThreadExtendtedWgroup thread5 = new ThreadExtendtedWgroup(group,"task ->5");
         ThreadExtendtedWgroup thread6 = new ThreadExtendtedWgroup(group,"task->6");
         ThreadExtendtedWgroup thread3 = new ThreadExtendtedWgroup(group,"task ->3");
         
        thread4.start();
        thread5.start();
        thread6.start();
        thread3.start();
        
        System.out.println("Thread Group: " + group.getName());
        System.out.println("Active threads in the group: " + group.activeCount());
         
    }
}

class ThreadExtendted extends Thread{
        private String threadname;
    ThreadExtendted(String name) {
       
        this.threadname=name;
    }

    @Override
    public void run() {
        System.out.println("Courrent thread : "+ getThreadname());
       
    }

    public String getThreadname() {
        return threadname;
    }

    void setThreadGroup(ThreadGroup group) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
}

class ThreadExtendtedWgroup extends Thread{
        private String threadname;
    ThreadExtendtedWgroup(ThreadGroup group,String name) {
        super(group,name);
        this.threadname=name;
    }

    @Override
    public void run() {
        System.out.println("Courrent thread : "+ getThreadname());
       
    }

    public String getThreadname() {
        return threadname;
    }

    void setThreadGroup(ThreadGroup group) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
}


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
