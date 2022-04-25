public class ExWhileLoops {
  public static void main(String[] args) {

    /*
     * Simple while loop
     */
    int i = 25;
    while (i <= 44) {
      System.out.println(i);
      i++;
    }

    /*
     * While loop executes until a condition is met, condition is dependent on a
     * random number being generated and evaluated.
     */
    int conditional = 75;
    int choice = 0;
    System.out.println(
        "\nint conditional = 75;\nint choice = 0; \n\twhile (choice < 75) { in loop 'choice' value is updated in each loop to a random int from 0 to < 100 }\n");
    while (choice < 75) {
      System.out.println("  "
          + choice + " is less than " + conditional + ".");
      choice = (int) (Math.random() * 100);
    }
    System.out.println();
  }
}