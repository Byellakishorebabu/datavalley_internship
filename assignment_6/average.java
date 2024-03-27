
import java.util.Scanner;

public class userwants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        
        char choice;
        
        try {
            do {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                
                if (number > large) {
                    large = number;
                }
                if (number < small) {
                    small = number;
                }
                
                sum += number;
                count++;
                
                System.out.print("you want to try again ? (Y/N): ");
                choice = input.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');
            
            double average = (double) sum / count;
            
            System.out.println("Largest number entered: " + large);
            System.out.println("Smallest number entered: " + small);
            System.out.println("Average of all numbers entered: " + average);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
}