import java.util.Scanner;

public class ExDelimiters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers (on the same line");
        int int01 = scanner.nextInt();
        int int02 = scanner.nextInt();
        System.out.println("Enter two very big integers (on the same line");
        long lng01 = scanner.nextLong();
        long lng02 = scanner.nextLong();
        System.out.println("Enter two decimals (on the same line");
        double dbl01 = scanner.nextDouble();
        double dbl02 = scanner.nextDouble();
        System.out.println("Enter two text values (on the same line");
        String txt01 = scanner.next();
        String txt02 = scanner.next();

        scanner.close();

        System.out.println("\n\tIntegers: " + int01 + " & " + int02);
        System.out.println("\tBig Integers: " + lng01 + " & " + lng02);
        System.out.println("\tDecimals: " + dbl01 + " & " + dbl02);
        System.out.println("\tText values: " + txt01 + " & " + txt02);
    }
}
