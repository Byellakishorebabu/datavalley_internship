import java.util.*;
public class divide13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 7 == 0 && number % 13 == 0) {
            int quotient7 = number / 7;
            int remainder7 = number % 7;
            int quotient13 = number / 13;
            int remainder13 = number % 13;
            
            System.out.println(number + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient7 + ", Remainder: " + remainder7);
            System.out.println("Quotient when divided by 13: " + quotient13 + ", Remainder: " + remainder13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }
        
        input.close();
    }
}
