import java.util.Scanner;

public class WbJavaRollsLoopy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalScore = 0;
    int thisRoll = 0;

    /*
     * Task 1:
     * 1. print: Let's play Rolling Java. Type anything to start.
     * 2. Get the user to enter any value
     */
    System.out.println("Let's play Rolling Java.\n\tType any key to start.");
    scanner.nextLine();
    /*
     * Task 2:
     * 1. Once the user is ready, print:
     * Great, here are the rules:\n
     * - If you roll a 6 the game stops.
     * - If you roll a 4 nothing happens.
     * - Otherwise, you get 1 point.\n
     * You must collect at least 3 points to win. Enter anything to roll:
     * 2. Get the user to enter any value
     */
    System.out.println("Great, here are the rules:\n");
    System.out.println(" - If you roll a 6, the game ends.");
    System.out.println(" - If you roll a 4, nothing happens.");
    System.out.println(" - Get 1 point if you roll 1, 2, 3, or 5.");
    System.out.println("Collect at least 3 points to win!!");
    System.out.print("\nPress Enter to roll the dice.");

    /*
     * Task 3
     * 1. Make a while loop that runs forever
     * 2. During each run, get them to enter a random value
     * 
     * 
     * Task 5
     * 1. During each run, call the rollDice() function.
     * 2. Print each dice roll like so: You rolled a <diceRoll>.
     * 
     * Task 6
     * If the user rolls a 6:
     * 1. print: End of game.
     * 2. stop the game.
     * 
     * If the user rolls a 4:
     * 1. print: Zero points. Keep rolling.
     * 
     * If the user rolls anything else:
     * 1. update the points variable by 1
     * 2. print: One point. Keep rolling.
     * 
     */
    while (true) {
      scanner.nextLine();
      thisRoll = rollDie();
      System.out.print("\nYou rolled a " + thisRoll + ". ");
      if (thisRoll == 6) {
        System.out.print("End of game.\n");
        break;
      }
      if (thisRoll == 4) {
        System.out.print("Zero points. ");
      } else {
        totalScore++;
        System.out.print("One point. ");
      }
      System.out.println("Keep rolling.");

    }

    /*
     * Task 7
     * 
     * 1. After the game ends, check the user's points.
     * 
     * System.out.println("\nYour score is: " + score);
     * 
     * 2. If the score is greater than or equal to 3, print:
     * Wow, that's lucky. You win!
     * Otherwise, print:
     * Tough luck, you lose :(
     */
    System.out.println("\nYour score is: " + totalScore);
    if (totalScore >= 3) {
      System.out.println("Wow, that's lucky. You win!");
    } else {
      System.out.println("Tough luck, you lose :(");
    }

    scanner.close();
  }

  /**
   * Task 4
   * Function name: rollDice – rolls a dice between 1 and 6
   * 
   * @return randomNumber (int)
   * 
   */
  private static int rollDie() {
    return (int) (Math.random() * 6 + 1);
  }

}
