class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class CustomValidationDemo {
    public static void main(String[] args) {
        try {
            validateNumber(5);
            System.out.println("Number is valid.");
            
            validateNumber(-3); // This will throw CustomValidationException
        } catch (CustomValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative.");
        }
    }
}
