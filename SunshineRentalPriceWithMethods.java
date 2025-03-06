import java.util.Scanner;

public class SunshineRentalPriceWithMethods {
    // Constants
    public static final int MINUTES_IN_HOUR = 60;
    public static final double HOURLY_RATE = 40.00;

    public static void main(String[] args) {
        int rentalMinutes = getRentalTime(); // First method call
        displayCompanyMotto(); // Second method call
        computeAndDisplayRentalPrice(rentalMinutes); // Third method call
    }

    // Method to get rental time in minutes from the user
    public static int getRentalTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes rented: ");
        int minutes = scanner.nextInt();
        scanner.close();
        return minutes;
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        System.out.println("\n******************************");
        System.out.println("*  Sunshine Seashore Supplies  *");
        System.out.println("*  - Your Beach Adventure Awaits! - *");
        System.out.println("******************************\n");
    }

    // Method to compute and display rental price
    public static void computeAndDisplayRentalPrice(int minutes) {
        int hours = minutes / MINUTES_IN_HOUR;
        int extraMinutes = minutes % MINUTES_IN_HOUR;
        double totalPrice = hours * HOURLY_RATE + (extraMinutes > 0 ? HOURLY_RATE : 0);

        System.out.println("Total Rental Time: " + minutes + " minutes");
        System.out.println("Converted Time: " + hours + " hour(s) and " + extraMinutes + " minute(s)");
        System.out.println("Total Price: $" + totalPrice);
    }
}
