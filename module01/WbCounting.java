import java.util.Scanner;

public class WbCounting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int countToNumber = 0;

    System.out.println();
    /*
     * Task 1 – Choose a number
     * 
     * Ask: Hi Timmy! Choose a number to count to:
     * 
     * Make sure Timmy can enter the value BESIDE the question.
     */
    System.out.print("Ask: Hi Timmy! Choose a number to count to: ");
    countToNumber = scanner.nextInt();

    /*
     * Task 2 – Count from 0 to that number
     * 
     * Let's say Timmy entered 5, you would display: 0 1 2 3 4 5
     * 
     */

    System.out.println();
    for (int i = 0; i <= countToNumber; i++) {
      System.out.print(" " + i);
    }
    System.out.println("\n");
    scanner.close();
  }
}