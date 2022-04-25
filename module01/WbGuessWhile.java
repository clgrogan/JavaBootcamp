import java.util.Scanner;

public class WbGuessWhile {

  public static void main(String[] args) {
    int secretInt = 0;
    int userGuess = 0;
    Scanner scanner = new Scanner(System.in);
    /*
     * Task 1
     * 1. Store a "secret" number between 1 and 5.
     * 2. Then, prompt the user to enter a guess.
     */
    secretInt = (int) (Math.random() * 5 + 1);
    System.out.print("\nI chose a number between 1 and 5. \n\tTry to guess my number: ");

    /*
     * Task 2
     * 1. Set up a loop that keeps running while the user is incorrect
     * Every time they get it wrong, write 'Guess again: '
     * 
     * 2. Once they guess it, print: You got it!
     */
    while (secretInt != userGuess) {
      userGuess = scanner.nextInt();
      if (secretInt != userGuess)
        System.out.print("Guess again: ");
    }
    System.out.println("\n\tYou got it!!!\n");
  }

}