
import java.util.Scanner;

public class QuizzApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Who is known as the father of Java programming?",
            "2. Which company developed Java?",
            "3. What is the extension of Java bytecode files?"
        };

        String[][] options = {
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. Microsoft", "B. Sun Microsystems", "C. IBM", "D. Oracle"},
            {"A. .java", "B. .class", "C. .exe", "D. .js"}
        };

        char[] answers = {'A', 'B', 'B'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            char userAnswer;
            while (true) {
                System.out.print("Your answer (A/B/C/D): ");
                String input = sc.next().toUpperCase();
                if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                    userAnswer = input.charAt(0);
                    break;
                } else {
                    System.out.println("⚠️ Invalid input. Please enter A, B, C, or D.");
                }
            }

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is " + answers[i]);
            }
            System.out.println();
        }

        System.out.println("🎯 Your Score: " + score + "/" + questions.length);

        // Final feedback
        if (score == questions.length) {
            System.out.println("🏆 Perfect score! You're a Java whiz!");
        } else if (score >= questions.length / 2) {
            System.out.println("👍 Good job! Keep learning.");
        } else {
            System.out.println("📘 Keep practicing. You'll get there!");
        }

        sc.close();
    }
}
