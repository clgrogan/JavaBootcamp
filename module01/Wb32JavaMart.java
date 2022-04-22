public class Wb32JavaMart {
  public static void main(String[] args) {
    double wallet = 100;

    double toyCar = 5.99;
    System.out.println("\nCan I get this car?");

    // if you have enough money
    // print: Sure!
    // pay for the toy car

    // else: Sorry, I only have <wallet> left.
    if (wallet >= toyCar) {
      System.out.println("Sure!\n");
      wallet -= toyCar;
    } else {
      System.out.println("\tSorry, I only have " + wallet + " left.");
    }

    double nike = 95.99; // run test case with 89.99
    System.out.println("\nCan I get these nike shoes?");
    // if you have enough money
    // print: Sure!
    // pay for the nike shoes

    // else: Sorry, I only have <wallet> left.
    if (wallet >= nike) {
      System.out.println("\tSure!\n");
      wallet -= nike;
    } else {
      System.out.println("\tSorry, I only have " + wallet + " left.");
    }
    System.out.println();
  }
}
