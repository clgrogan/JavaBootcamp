public class WbAppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("\nYou picked 500 apples from an apple orchard");
        numOfApples += 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");
        // Make a price variable. Set it equal to 40 cents.
        double priceOfApple = 0.40;

        System.out.println("One customer walked in. He bought 4 apples!");
        // Update number of apples.
        numOfApples -= 4;

        // Update number of customers;
        numOfCustomers++;

        // Update profit
        profit += priceOfApple * 4;

        System.out.println("Another customer walked in. He bought 20 apples!");
        // Update number of apples;
        numOfApples -= 20;
        // Update number of customers;
        numOfCustomers++;
        // Update profit
        profit += 20 * priceOfApple;

        System.out.println("Another customer walked in. She bought 200 apples!");
        // Update number of apples;
        numOfApples -= 200;
        // Update number of customers;
        numOfCustomers++;
        // Update profit
        profit += priceOfApple * 200;

        System.out.println("\nWow! So far, you made: $" + profit);
        System.out.println("<number of customers> + customers love your apples.");
        System.out.println("You have <number of apples> apples left. We'll sell more tomorrow!\n");

    }

}