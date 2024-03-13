public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        
        try {
            divideNumbers(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}
