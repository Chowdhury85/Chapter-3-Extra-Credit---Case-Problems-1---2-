import java.util.Scanner;

public class YummyEventPriceWithMethods {
    // Constant price per guest
    public static final double PRICE_PER_GUEST = 35.00;
    public static final int LARGE_EVENT_THRESHOLD = 50;

    public static void main(String[] args) {
        int numGuests = getNumberOfGuests(); // First method call
        displayCompanyMotto(); // Second method call
        computeAndDisplayEventPrice(numGuests); // Third method call
    }

    // Method to get the number of guests from the user
    public static int getNumberOfGuests() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int guests = scanner.nextInt();
        scanner.close();
        return guests;
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        System.out.println("\n****************************");
        System.out.println("*  Yummy Catering Services  *");
        System.out.println("*  - Delicious Every Time! - *");
        System.out.println("****************************\n");
    }

    // Method to compute and display the event price
    public static void computeAndDisplayEventPrice(int guests) {
        double totalPrice = guests * PRICE_PER_GUEST;
        boolean isLargeEvent = guests >= LARGE_EVENT_THRESHOLD;

        System.out.println("Number of Guests: " + guests);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
