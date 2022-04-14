public class MathOperationsEx04 {
  public static void main(String[] args) {
    int bagOfSweets1 = 5;
    int bagOfSweets2 = 10;

    long starsInMilkyWay = 2500000000L;
    long starsInAndromeda = 1000000000000L;

    double testScore = 6.7;
    double bonusMarks = 2.5;

    // Plus Operator
    System.out.println(bagOfSweets1 + bagOfSweets2);
    System.out.println(starsInMilkyWay + starsInAndromeda);
    System.out.println(testScore + bonusMarks);

    // Multiplication operator *
    System.out.println(bagOfSweets1 * bagOfSweets2);
    System.out.println(testScore * bonusMarks);
    // System.out.println(starsInAndromeda * starsInMilkyWay);

    // Division -
    System.out.println(bagOfSweets2 / bagOfSweets1);
    System.out.println(starsInAndromeda / starsInMilkyWay);
    System.out.println(testScore / bonusMarks);

    // Modulous operator %
    // returns remainder of a division
    System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + 10 % 2);

    // Increment operator ++
    int counter = 0;
    counter++;
    counter++;
    counter++;
    System.out.println("I count: " + counter);

    // Decrement operator --
    counter--;
    counter--;
    counter--;
    System.out.println("I count: " + counter);

    // Add by operator += & subtract by operator -=
    counter += 3;
    System.out.println("I count: " + counter);
    counter -= 3;
    System.out.println("I count: " + counter);

  }
}
