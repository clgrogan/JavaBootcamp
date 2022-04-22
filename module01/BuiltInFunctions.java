public class BuiltInFunctions {
  public static void main(String[] args) {
    System.out.println("\nBuilt in 'functions' are functions included in Java JDK\n");

    System.out.println("Math class methods typically accept and return double values.");
    System.out.println("\tMath.log(double) with (100)" + Math.log(100));
    System.out.println("\tMath.sin(double) with (1.2): " + Math.sin(1.2));
    System.out.println("\tMath.sin(double) with (1.2): " + Math.max(4, 5));
    System.out.println("\tMath.pow(int,int) with (2, 4): " + Math.pow(2, 4));
    System.out.println("\tMath.random() with (): " + Math.random());
    System.out.println("\tMath.random() with () * 100: " + Math.random() * 100);
    System.out.println();
  }
}