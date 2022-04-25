public class WbBeer {
  public static void main(String[] args) {
    // Task 2: make a for loop that starts at i = 99, and finishes at i=1.

    System.out.println();

    for (int i = 99; i >= 1; i--) {
      sing(i);
    }

    System.out.println();
  }

  /**
   * Task 1
   * Function name – sing.
   * 
   * @param i (int)
   *          Inside the function:
   *          1. print:
   *          <i> bottles of beer on the wall, <i> bottles of beer!
   *          take one down, pass it around, <i-1> bottles of beer on the wall!
   */
  private static void sing(int i) {
    System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!\n"
        + "  Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall!");
  }
}