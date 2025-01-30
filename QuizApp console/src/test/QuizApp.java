
package test;


import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Question {
   private String questions;
   private List<String> options;
   private int RightAns;

    public Question(String questions, List<String> options, int RightAns) {
        this.questions = questions;
        this.options = options;
        this.RightAns = RightAns;
    }

    public String getQuestions() {
        return questions;
    }

   public List<String> getOptions(){
   return options;
   }

    public int getRightAns() {
        return RightAns;
    }
}

public class QuizApp {
  
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
        "What is the best language",Arrays.asList("1. java","2.Javascript","3.Python"),2
        ));
        questions.add(new Question(
        "What is the best backend language",Arrays.asList("1. java","2.Javascript","3.Python","4.Go"),4
        ));
        questions.add(new Question(
        "What is the best framework",Arrays.asList("1. spring boot","2. tailwind css","3.flesk"),2
        ));
        
        Scanner input = new Scanner(System.in);
        ExecutorService exc = Executors.newSingleThreadExecutor();
        int score=0;
       //  loop till all question n Answer...
        for(Question q: questions){
        
            System.out.println("\n"+ q.getQuestions());
            for(String ops:q.getOptions()){
                System.out.println(ops);
            }
            System.out.print("Your Answer: ");
            // timing on receving answeer..
            Future<Integer> resultAFterThread = exc.submit(()-> {
                return input.nextInt();
            });
            try {
              int theirAns =  resultAFterThread.get(10, TimeUnit.SECONDS);
                if (q.getRightAns()==theirAns) {
                    score++;
                    System.out.println("Correct answer! your score is :  "+ score);
                }else{System.out.println("Wrong answer, Right ansn is : "+ q.getRightAns());}
            } catch (TimeoutException ex) {
                System.out.println("Time Out! "+ q.getRightAns());
            }
}
        System.out.println("Youre score is : "+ score);
        exc.shutdown();
  input.close();
        
        }
                
    }
          
