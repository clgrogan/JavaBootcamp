public class WbRollDoubles {
  public static void main(String[] args) {

    int die01 = 0;
    int die02 = 1;
    /*
     * Task 2
     * 1. Call the rollDice() function twice.
     * 2. Store the return values in dice1 and dice2.
     * 
     */

    /*
     * Task 3
     * 1. Set up a loop that keeps running while the two dice aren't the same.
     * 2. During each run, re-roll the dice and print the two values.
     */

    // Task 4: After they roll doubles, print: You rolled doubles!
    while (die01 != die02) {
      die01 = rollDie();
      die02 = rollDie();
      System.out.println("\nDice 1: " + die01);
      System.out.println("Dice 2: " + die02);
    }
    System.out.println("\nYou rolled doubles!\n");
  }

  /**
   * Function name: rollDice – rolls a dice between 1 and 6
   * 
   * @return randomNumber (int)
   * 
   */
  private static int rollDie() {
    int roll = 0;
    roll = (int) (Math.random() * 6 + 1);
    return roll;
  }
}