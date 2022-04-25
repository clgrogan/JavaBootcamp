import java.util.Scanner;

public class WbSignInWhile {
  public static void main(String[] args) {
    String username = "Samantha";
    String password = "Java <3";
    String inputUsername = "";
    String inputPassword = "";

    /*
     * Task 1
     * 1. Pick up a username and password from the user.
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nWelcome to Javagram! Sign in below\n");
    System.out.print("• Username: ");
    inputUsername = scanner.nextLine();
    System.out.print("• Password: ");
    inputPassword = scanner.nextLine();

    /*
     * Task 2
     * 1. Set up a loop that keeps running while the username OR password is
     * incorrect.
     * When they get it wrong:
     * • println: \nIncorrect, please try again!\n
     * • get them to enter their username and password again
     */
    while (!username.equals(inputUsername) || !password.equals(inputPassword)) {
      System.out.println("\nIncorrect, please try again!\n");
      System.out.print("• Username: ");
      inputUsername = scanner.nextLine();
      System.out.print("• Password: ");
      inputPassword = scanner.nextLine();
    }

    /*
     * 2. After they enter the correct information, print:
     * \nSign in successful. Welcome!
     */
    System.out.println("\nSign in successful. Welcome!\n");

    scanner.close();

  }
}
