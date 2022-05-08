import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a guess between 1 and 100");
        int userAnswer = scanner.nextInt();

        // Guess 1
        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else printIncorrectMessage(userAnswer, computerNumber, "Your guess is too high, guess again.");

        // Guess 2
        System.out.println("Enter a guess between 1 and 100");
        userAnswer = scanner.nextInt();

        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else printIncorrectMessage(userAnswer, computerNumber, "Your guess is too high, guess again.");

        // Guess 3
        System.out.println("Enter a guess between 1 and 100");
        userAnswer = scanner.nextInt();

        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else printIncorrectMessage(userAnswer, computerNumber, "Your guess is too high");

        System.out.println("Sorry for your luck, restart the program to play again!");
    }

    private static void printIncorrectMessage(int userAnswer, int computerNumber, String x) {
        if (userAnswer > computerNumber) {
            System.out.println(x);
        }
        else if (userAnswer < computerNumber) {
            System.out.println("Your guess is too low, guess again.");
        }
        else {
            System.out.println("Your guess is incorrect");
        }
    }
}
