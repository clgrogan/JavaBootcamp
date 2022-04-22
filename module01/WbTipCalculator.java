public class WbTipCalculator {
  public static void main(String[] args) {
    double check = 53.50;
    double tipPercentage = 15.00;
    double tip = 0.00;

    tip = tipTheWaiter(check, tipPercentage);
    System.out.println("Your service was wonderful! Please accept this tip $" + tip + ".");

  }

  private static double tipTheWaiter(double check, double tipPercentage) {
    double tipAmount = 0;
    tipAmount = check * tipPercentage / 100;

    return tipAmount;
  }
}