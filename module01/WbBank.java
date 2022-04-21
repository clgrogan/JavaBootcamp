import java.util.Scanner;

public class WbBank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String hereForMortgage = "";
        String name = "";
        double savings = 0;
        double creditCardDebt = 0;
        double yearsWorked = 0;
        final double MIN_SAVINGS = 10000;
        final double MAX_CREDIT_CARD_DEBT = 5000;

        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        hereForMortgage = scanner.nextLine();

        if (hereForMortgage.equals("yes")){

            //Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! \nIn one line" +
                "\n\tHow much money do you have in your savings?" +
                "\n\tAnd, how much do you owe in credit card debt?");
                savings = scanner.nextDouble();
                creditCardDebt = scanner.nextDouble();
                
                    // Task 3 - Pick up each value 
                System.out.println("\nHow many years have you worked for?");
                yearsWorked = scanner.nextDouble();
                   // Task 4 - Pick up number of years
    
                System.out.println("What is your name?");
                scanner.nextLine();
                name = scanner.nextLine();
                   // Task 5 - Pick up the user's name
                    
                   //Task 6 - Approve the mortgage if they meet the requirements (see article)
                   //       - Otherwise, don't give them a mortgage. 
                      if (savings >= MIN_SAVINGS && creditCardDebt < MAX_CREDIT_CARD_DEBT && yearsWorked > 2)      {

                        System.out.println("\nCongratulations, "+name+ ". You have been approved!");
                      } else {
                   System.out.println("\nSorry, "+name+" you are not eligible for a mortgage.");
                      }
    

        }

        System.out.println("\nOK. Have a nice day!");
        scanner.close();
    }
}
