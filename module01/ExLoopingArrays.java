public class ExLoopingArrays {
  public static void main(String[] args) {
    String[] students = { "Harry", "Neville", "Ron" };
    System.out.println("\n"
        + "\nLooping with for().\n"
        + "\n String[] students = {\"Harry\", \"Neville\", \"Ron\"}"
        + "\n for (int i = 0; i < i; i++) {\n  System.out.println(\"Students element # \" + i + \" is \" + students[i]); }");
    for (int i = 0; i < students.length; i++) {
      System.out.println("\nStudents element # " + i + " is " + students[i]);
    }
    System.out.println();
  }
}