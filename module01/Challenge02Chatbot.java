import java.util.Scanner;

public class Challenge02Chatbot {
  public static void main(String[] args) {

    // set up scanner.
    Scanner scanner = new Scanner(System.in);

    // Variable declaration
    String name;
    String home;
    int age;
    String language;

    System.out.println("\nHello. What is your name?");
    // Pick up user's name and store it.
    name = scanner.nextLine();

    // add new a line before asking next question.
    System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
    home = scanner.nextLine();

    // add new a line before asking next question.
    System.out.println("\nI hear it's beautiful in " + home + "! I'm from a place called Oracle");
    System.out.println("How old are you?");
    age = scanner.nextInt();

    // add new a line before asking next question.
    scanner.nextLine();
    System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
    System.out.println("This means I'm " + 400 / age + " times older than you.");
    System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
    // Pick up language and store it.
    language = scanner.nextLine();

    // add new a line here.
    System.out.println(
        "\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!\n");

    // close scanner.
    scanner.close();

  }

}
