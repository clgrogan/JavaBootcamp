import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class WbDetention {
  public static void main(String[] args) {
    String sentence = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nHi, Bart. I can write lines for you.\n\tWhat do you want me to write?");

    sentence = scanner.nextLine();
    System.out.println();

    for (int i = 1; i <= 99; i++) {
      System.out.println(i + ". " + sentence);
    }
  }
}