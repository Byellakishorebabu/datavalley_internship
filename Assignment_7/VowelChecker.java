import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert the string to lowercase for easier comparison

        int vowelCount = 0;
        boolean vowelPresent = false;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (isVowel(ch)) {
                vowelPresent = true; // Set flag to true if a vowel is found
                vowelCount++; // Increment vowel count
            }
        }

        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
