public class WbConvertTemperature {
  public static void main(String[] args) {
    double noon = 77;
    double evening = 61;
    double midnight = 55;

    printTemperatures(noon);
    printTemperatures(evening);
    printTemperatures(midnight);
  }

  private static double fareinheitToCelsius(double f) {
    double c = (f - 32) * 5 / 9;
    return c;
  }

  private static void printTemperatures(double f) {
    System.out.println("F: " + f);
    System.out.println("C: " + fareinheitToCelsius(f));
    System.out.println();
  }
}