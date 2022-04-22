import java.util.Scanner;

public class ExDiceJack {
  /**
   * DiceJack is an interactive game with
   * Purpose is to demonstrate
   * - Organizing code into functions
   * - Define functions that take paramers
   * - Call functions and pass arguments
   * - Return values
   * Rules
   * - User enters three integers 1 - 6
   * - User rolls dice three times
   * - User Wins
   * - If sum of the dice rolls is SMALLER than the sum of the picked numbers.
   * AND the difference between the two totals is less than three
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int roll1;
    int roll2;
    int roll3;
    int inp1;
    int inp2;
    int inp3;

    roll1 = rollDice();
    roll2 = rollDice();
    roll3 = rollDice();

    System.out.println("\nEnter three numbers from one to six...");
    inp1 = scan.nextInt();
    inp2 = scan.nextInt();
    inp3 = scan.nextInt();

    scan.close();

    if (inp1 < 1 || inp2 < 1 || inp3 < 1) {
      System.out.println("\n\tNumbers can't be less than 1. Shutting the game down!\n");
      System.exit(0);
    }
    if (inp1 > 6 || inp2 > 6 || inp3 > 6) {
      System.out.println("\n\tNumbers can't be greater than 6. Shutting the game down!\n");
      System.exit(0);
    }

    int sumOfInput = inp1 + inp2 + inp3;
    int sumOfDiceRolls = roll1 + roll2 + roll3;

    System.out.println("\nSum of dice rolls: " + sumOfDiceRolls);
    System.out.println("Sum of input #s: " + sumOfInput);

    System.out.println();

    if (checkWin(sumOfInput, sumOfDiceRolls)) {
      System.out.println("Congrats! You win!");
    } else {
      System.out.println("Sorry! You loser.");
    }
    System.out.println();

    System.out.println(roll1);
    System.out.println(roll2);
    System.out.println(roll3);
    System.out.println(inp1);
    ;
    System.out.println(inp2);
    ;
    System.out.println(inp3);
  }

  /**
   * Method name: rollDice
   * 
   * @return value: int
   */
  private static int rollDice() {
    return (int) ((Math.random() * 6) + 1);
  }

  private static boolean checkWin(int inputTotal, int rollsTotal) {
    return (inputTotal > rollsTotal && inputTotal - rollsTotal < 3);
  }
}