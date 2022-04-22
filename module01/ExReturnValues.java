public class ExReturnValues {
  public static void main(String[] args) {
    double measure1 = measureRectangle(-2.2, 4.3, "area");
    double measure2 = measureRectangle(4.4, 4.3, "parimeter");
    System.out.println();
    stringPrinter(2.2, 4.3, measure1, "area");
    stringPrinter(4.4, 4.3, measure2, "parimeter");

  }

  private static double measureRectangle(double width, double length, String option) {
    if (width < 0 || length < 0) {
      System.out.println("\nNeither width or length can be less than zero.\n\n\tExiting application!\n");
      System.exit(0);
    }
    switch (option) {
      case "area":
        return width * length;
      case "parimeter":
        return width * 2 + length * 2;
    }
    return 0;
  }

  private static void stringPrinter(double length, double width, double measure, String option) {
    System.out
        .println("The " + option + " of the rectangle with width " + width + " and length " + length + " is " + measure
            + ".\n");
  }
}