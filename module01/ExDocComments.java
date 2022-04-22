public class ExDocComments {
  public static void main(String[] args) {

  }

  /**
   * Function name: greet
   * 
   * Inside the function:
   * 1. Prints: 'Hi'
   * 
   */
  public static void greet() {
    System.out.println("\nHi!\n");
  }

  /**
   * Function name: printText
   * 
   * @param name (String)
   * @param age  (String)
   * 
   *             Inside the function:
   *             1. Prints the name and age as part of a text.
   */
  public static void printText(String name, String age) {
    System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
  }

  /**
   * Function name: calculateArea
   * 
   * @param length (double)
   * @param width  (double)
   * @return (double)
   */
  public static double calculateArea(double length, double width) {
    return length * width;
  }
}