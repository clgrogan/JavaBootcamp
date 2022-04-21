import java.util.Scanner;

public class ExScanner {
  public static void main(String[] args) {

    int counter = 0;
    Scanner scan = new Scanner(System.in);

    // scanner methods
    System.out.println("\nWelcome. Thank you for taking the survey");

    System.out.println("\nWhat is your name?");
    String name = scan.nextLine();
    counter++;

    System.out.println("\nHow much do you spend on coffee?");
    double coffeePrice = scan.nextDouble();
    counter++;

    System.out.println("\nHow much do you spend on fast food?");
    double foodPrice = scan.nextDouble();
    counter++;

    System.out.println("\nHow often do you buy coffee per week?");
    int timesCoffee = scan.nextInt();
    counter++;

    System.out.println("\nHow often do you buy fast food per week?");
    int timesFastFood = scan.nextInt();
    counter++;

    System.out.println("\nThank you, " + name + ", for answering the " + counter + " questions.");

    System.out.println("\nYour fast food costs per unit are " + foodPrice / coffeePrice + " than coffee.");

    System.out.println("\nYou spend $" + (coffeePrice * timesCoffee) + " a week on coffee.");

    System.out.println("\nYou spend $" + (foodPrice * timesFastFood) + " a week on fast food.");

    System.out.println();
    scan.close();
  }
}
