
package test;

import java.util.*;
import java.util.concurrent.*;

class Question {
    private String question;
    private List<String> options;
    private int correctAnswer;

    public Question(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() { return question; }
    public List<String> getOptions() { return options; }
    public int getCorrectAnswer() { return correctAnswer; }
}

public class NewTast {
    private static volatile boolean answered = false;
    private static int score = 0;

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
            "What is 2 + 2?",
            Arrays.asList("1. 3", "2. 4", "3. 5", "4. 6"), 2
        ));
        questions.add(new Question(
            "Capital of France?",
            Arrays.asList("1. London", "2. Paris", "3. Berlin", "4. Madrid"), 2
        ));

        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (Question q : questions) {
            System.out.println("\nQuestion: " + q.getQuestion());
            for (String opt : q.getOptions()) {
                System.out.println(opt);
            }

            answered = false;
            System.out.print("Enter your answer (1-4): ");

            Future<String> future = executor.submit(() -> scanner.nextLine());

            try {
                String input = future.get(10, TimeUnit.SECONDS); // 10-second timeout
                int answer = Integer.parseInt(input);
                if (answer == q.getCorrectAnswer()) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer());
                }
            } catch (TimeoutException e) {
                future.cancel(true);
                System.out.println("\nTime's up! Moving to next question.");
            } catch (Exception e) {
                System.out.println("Invalid input. Skipping...");
            }
        }

        executor.shutdown();
        System.out.println("\nQuiz ended! Score: " + score + "/" + questions.size());
    }
}