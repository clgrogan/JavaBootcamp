public class ExBreakAndContinue {
  public static void main(String[] args) {

    System.out.println("\nContinue -- Skips the rest of the current iteration and starts the next iteration.");
    System.out.println(" for loop using 'continue'\n\tfor (int i = 0; i < 14; i++) {"
        + "\n\t  if (i % 2 != 0) "
        + "\n\t     continue;"
        + "\n\t  System.out.println(i + \" - print index numbers.\");"
        + "\n\t }");
    for (int i = 0; i < 14; i++) {
      if (i % 2 != 0)
        continue;
      System.out.println(i + " - print index numbers.");
    }
    System.out.println("\n\nBreak -- Exits the loop immediately.");
    System.out.println(" for loop using 'break' INSTEAD OF 'continue'\n\tfor (int i = 0; i < 14; i++) {"
        + "\n\t   if (i % 2 != 0) break;"
        + "\n\t     break;"
        + "\n\t   System.out.println(i + \" - print index numbers.\");"
        + "\n\t }");
    for (int i = 0; i < 14; i++) {
      if (i % 2 != 0)
        break;
      System.out.println(i + " - print index numbers.");
    }
    System.out.println();
  }

}