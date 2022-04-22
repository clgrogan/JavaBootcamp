public class ExScope {
  /**
   * Class ExScope
   * demonstrate function scope and class scope
   */
  private static int dogs = 5;

  public static void main(String[] args) {
    int apples = 5;
    System.out.println("\nClass variable dogs accessed within main method: \n\t" + dogs);
    someFunction();
  }

  private static void someFunction() {
    // System.out.println(apples);//fails to compile
    System.out.println("\nClass variable dogs accessed within some function: \n\t" + dogs);
  }
}