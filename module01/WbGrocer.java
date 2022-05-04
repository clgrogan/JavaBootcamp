import java.util.Scanner;

public class WbGrocer {
  public static void main(String[] arrghhhs) {
    /*
     * Task 1: Create an array that stores each aisle:
     * apples – bananas – candy – chocolate – coffee – tea
     * 
     * Then, use a for loop to print each element in the array.
     */
    String aisles[] = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
    String item = "coffee";
    Scanner scanner = new Scanner(System.in);

    /*
     * Task 2:
     * 1. System.out.println("\nDo you sell coffee?");
     * 
     * 2. Using the for loop from task 1:
     * • check if Java Grocer sells coffee.
     * • if so, break the loop and print: \nWe have that in aisle: <index>
     * 
     */
    System.out.println("\nWelcome to Java Grocers.");
    System.out.println("What can I help you find?\n");
    item = scanner.nextLine();
    for (short s = 0; s < aisles.length; s++) {
      if (aisles[s].equals(item)) {
        System.out.println("\n\tWe have that in aisle: " + s + "\n");
        break;
      }

    }

  }
}
