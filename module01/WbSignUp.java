import java.util.Scanner;

public class WbSignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        String username;
        String city;
        String country;

        System.out.println("\nWelcome to JavaGram! Let's sign you up.");

        // Task 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("\nWhat is your first name?");
        firstName = scan.nextLine();

        // Ask for their last name.
        System.out.println("\nWhat is your last name?");
        lastName = scan.nextLine();

        // Ask: how old are you?
        scan.nextLine();
        System.out.println("\nWhat is your age?");
        age = scan.nextInt();

        // Ask them to make a username.
        System.out.println("\nEnter a username.");
        username = scan.nextLine();

        // Ask what city they live in.
        System.out.println("\nWhat city are you from?");
        city = scan.nextLine();

        // Ask what country that's from.
        System.out.println("\nWhat country are you from?");
        country = scan.nextLine();

        // Task 2 - Print their information.

        System.out.println("\nThank you for joining JavaGram!\n");

        // Print their information like so:

        // Your information:
        // First Name: Rayan
        // Last Name: Slim
        // Age: 27
        // Username: monotonic_relu
        // City: Ottawa
        // Country: Canada

        System.out.println("Your information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Namet: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scan.close();

        // close scanner. It's good practice :D !
    }
}