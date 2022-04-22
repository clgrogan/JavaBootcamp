public class ExParameters {
  public static void main(String[] args) {
    double length = 56;
    double width = 3;
    double area = 0;

    area = calculateArea(length, width);

    System.out
        .println("\nThe area of a rectangle with " + length + " length by " + width + " width is " + area + ".\n");

  }

  private static double calculateArea(double length, double width) {

    return length * width;
  }
}
