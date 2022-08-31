import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int tryCount = 3;
        int numberToGuess = (int) (1 + Math.random() * 10);

        System.out.println("Number is " + numberToGuess); // Этот чит надо удалить!

        for (int i = 0; i < 3; i++) {
            boolean stopAsking = tryCount > 0;
            if (stopAsking) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Guess the number from 1 to 10 (you have " + tryCount + " tries): ");
                int userAnswer = scanner.nextInt();
                tryCount--;
                boolean rightAnswer = userAnswer == numberToGuess;
                if (rightAnswer) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You wrong. Try again");
                }

            }
        }
    }
}
