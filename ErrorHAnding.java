package ErrorHandling;


import java.util.Scanner;


 //interface 
    interface Goal{
    public void Run();
    public void Study();
    public void Code();
    }
    
    class MeFr implements Goal{

    
        public void Run() {
            throw new UnsupportedOperationException("5am RUNNING"); 
        }
        public void Study() {
            throw new UnsupportedOperationException("10AM Studying."); 
        }
        public void Code() {
            throw new UnsupportedOperationException("3pm Coding");      
    }
}

public class ThreadsAndError {
    
    enum lvl{
    good,bad,evill}  
    
    
    public static void main(String[] args){
        
        try {
           AddingInt(); 
        } catch (InputError e) {
            System.out.println("Error Found : "+ e);
        }
    }
    
    public static void AddingInt() throws InputError {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a vaild input 1-100, 0 will throw error");
            int choice=  input.nextInt();
            
            if (choice < 1){                
                    throw new InputError("error in submisison");          
            }
            int value = choice * 100;
            input.close();
            System.out.println("Output is : "+value);
    }

    private static class InputError extends Exception {
        public InputError(String error_in_submisison) {           
        }
    }
}
