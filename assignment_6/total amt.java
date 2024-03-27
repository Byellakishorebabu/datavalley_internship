import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price per item: ");
        double price = input.nextDouble();

        double totalExpenses = 0;

        if (quantity > 50) {
            totalExpenses = quantity * price * 0.9;
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * price * 0.95;
        } else {
            totalExpenses = quantity * price;
        }

        System.out.println("Total expenses: $" + totalExpenses);

        input.close();
    }
}
