import java.util.Arrays;
import java.util.Scanner;

public class WbPizzaDelivery {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /**
     * Task 1:
     * 1. Ask the user: How many pizza toppings do you want?.
     * 2. Then, pick up the result using Scanner.
     */
    System.out.print("\nHow many pizza toppings do you want?");
    // Task 2 – Create the array here
    String toppings[] = new String[scanner.nextInt()];

    /**
     * Task 3
     * print Great, enter each topping!
     * Create a for loop that runs through the length of the array.
     * 
     */
    scanner.nextLine();
    System.out.println("\nGreat, enter each topping!");
    /**
     * Task 4 – Pick up the user's toppings and store them in the array.
     */

    for (int i = 0; i < toppings.length; i++) {
      System.out.print(i + ". ");
      toppings[i] = scanner.nextLine();
    }
    System.out.println(Arrays.toString(toppings));

    /**
     * Task 5 – Loop through the length of the array and print each topping
     * 
     * See the workbook article for more detail
     * 
     */
    System.out.println("\nThank you! Here are the toppings you ordered.");
    for (int i = 0; i < toppings.length; i++) {
      System.out.println(i + ". " + toppings[i]);
    }
    /**
     * Task 6 – Confirm the order
     * 
     * See the workbook article for more detail
     * 
     */
    System.out.println("\nPress Enter/Return to confirm your order.");
    scanner.nextLine();
    scanner.close();
  }
}