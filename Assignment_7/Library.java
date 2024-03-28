import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7) * 1.0;
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 * 1.0 + (daysLate - 14) * 5.0;
        } else {
            System.out.println("Your membership has been canceled for returning the book after 21 days.");
            System.exit(0); // Terminate the program
        }

        // Display the fine
        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);

        scanner.close();
    }
}
