import java.util.Scanner;

public class WbCountByTool {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double countBy = 0;
    double countFrom = 0;
    double countTo = 0;

    System.out.println("I hear you like to count by threes\n");
    System.out.println("Jimmy: It depends.");
    System.out.println("Oh, ok...");

    /*
     * Task 1 – Get integers from the user.
     * 
     * 
     * 1. print : Pick a number to count by:
     * pick up the user's answer
     * 
     * 
     * 2. print : Pick a number to start counting from:
     * pick up the user's answer
     * 
     * 3. print : Pick a number to count to:
     * pick up the user's answer
     * 
     */
    System.out.println("\nEnter a number to count by:");
    countBy = scanner.nextDouble();

    System.out.println("\nEnter a number to count from:");
    countFrom = scanner.nextDouble();

    System.out.println("\nEnter a number to count to:");
    countTo = scanner.nextDouble();

    /*
     * Task 2 – Create a for loop that:
     * 1. starts from the second number.
     * 2. stops at the third number.
     * 3. counts in steps of the first.
     */
    System.out.println();
    for (double d = countFrom; d <= countTo; d += countBy) {
      System.out.print(d + " ");
    }
    System.out.println();
  }
}