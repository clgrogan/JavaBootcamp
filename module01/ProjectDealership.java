import java.util.Scanner;

public class ProjectDealership {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userString = null;

        System.out.println();
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" * Enter 'a' to buy a car\n ");
        System.out.println(" * Enter 'b' to sell a car\n");

        userString = scanner.nextLine();

        switch (userString) {
            case "a": 
                // System.out.println("You chose " + userString );break;
                System.out.println("What is your budget?");
                double budget = scanner.nextDouble();
                scanner.nextLine();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available. So exciting!!!");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'.");
                    String insurance = scanner.nextLine();
                    System.out.println("\nDo you have a license? 'yes' or 'no'");
                    String license = scanner.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    double creditScore = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore >= 650 ) {
                        System.out.println("Sold! Pleasure doing business with you!");
                    } else {
                        System.out.println("You do not qualify. :(");
                    }
                } else {
                    System.out.println("We don't sell cars under $10,000. Sorry, dude!");
                }
                break;
            case "b": System.out.println("You chose " + userString);break;
            default: System.out.println("Enter an 'a' to buy a car or 'b' to sell a car...");break;
        }

        scanner.close();


    }
}
