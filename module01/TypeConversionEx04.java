public class TypeConversionEx04 {
  public static void main(String[] args) {
    double salary = 5833.63333;
    System.out
        .println(
            "\nDeclaration and assignment of the 'salary' variable:" +
                "\n\t'double salary = 5833.63333'");
    System.out.println("\nsyso print without casting:\n\tPercy's monthly salary is $" + salary);
    System.out.println(
        "\nCast the salary to int when printing."
            + "\n\tJust add the cast to type in front of salary like '(int)salary'");
    System.out.print("Percy's monthly salary is $" + (int) salary);
    System.out.println("\n\t\\\\This casting truncates to the int value.\n");
  }
}
