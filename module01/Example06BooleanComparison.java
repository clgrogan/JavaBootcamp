public class Example06BooleanComparison {
  public static void main(String[] args) {
    int grade1 = 5;
    int grade2 = 7;
    int grade3 = 7;

    System.out.println("\ngrade1 = 5\ngrade2 = 7\ngrade3 = 7");

    System.out.println("\n\tgrade1 > grade2 = " + (grade1 > grade2));
    System.out.println("\tgrade1 < grade2 = " + (grade1 < grade2));
    System.out.println("\tgrade1 >= grade2 = " + (grade1 >= grade2));
    System.out.println("\tgrade1 <= grade2 = " + (grade1 <= grade2));
    System.out.println("\tgrade1 == grade2 = " + (grade1 == grade2));
    System.out.println("\tgrade3 >= grade2 = " + (grade3 >= grade2));
    System.out.println("\tgrade3 <= grade2 = " + (grade3 <= grade2));
    System.out.println("\tgrade3 == grade2 = " + (grade3 == grade2));
    System.out.println("\tgrade1 != grade2 = " + (grade1 != grade2));
    System.out.println("\tgrade1 != grade3 = " + (grade1 != grade3));
    System.out.println("\tgrade2 != grade2 = " + (grade1 != grade2));

    System.out.println();
  }
}
