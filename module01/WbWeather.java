import java.util.Arrays;

public class WbWeather {
  public static void main(String[] args) {

    double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0, 0 };
    double[] fahrenheit;

    // Task 2, call celsiusToFahrenheit and store the result in the fahrenheit
    // array.
    fahrenheit = Arrays.copyOf(celciusToFahrenheit(celsius), celsius.length);

    // Task 4, Call printTemperatures for celsius and fahrenheit.
    System.out.println();
    printTemperatures(celsius, "Celsius");
    printTemperatures(fahrenheit, "Farenheit");
    System.out.println();
  }

  /**
   * Task 1
   * Function name: celciusToFahrenheit.
   * 
   * @param celsius ( double[] )
   * @return fahrenheit ( double[] )
   * 
   *         Inside the function:
   *         1. Create an array 'fahrenheit' with the same length as 'celsius'.
   *         2. Copy all the values from celsius into the fahrenheit array.
   *         3. Update all the values in the array according to: F = (C/5 * 9) +
   *         32.
   *         4. return the fahrenheit array.
   */
  private static double[] celciusToFahrenheit(double[] celsius) {
    double[] farenheit = new double[celsius.length];
    for (int i = 0; i < celsius.length; i++) {
      farenheit[i] = (celsius[i] * (9 / 5)) + 32;
    }
    System.out.println(Arrays.toString(farenheit));
    return farenheit;
  }

  /**
   * Task 3
   * Function name - printTemperatures
   * 
   * @param temp ( double[] )
   * @param type ( String ) can be either Celsius or Fahrenheit
   * 
   *             Inside the function:
   *             1. Uses a for loop to print the temperature values on the SAME
   *             line.
   *             Example: Celsius: [Celsius values separated by a space]
   *             2. Adds a new line of space after printing the contents of the
   *             array.
   *             3. (Task 5) Rounds every temperature value to two decimal places.
   */
  private static void printTemperatures(double[] temps, String type) {
    System.out.print(type + ":");
    for (double temp : temps)
      System.out.print(" " + temp);
    System.out.println();
  }
}
