import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Read year of joining
        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - yearOfJoining;

        // Determine bonus based on years of service
        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = 5000;
        } else if (yearsOfService >= 3) {
            bonus = 3000;
        }

        // Print bonus message
        if (bonus > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonus);
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }

        scanner.close();
    }
}
