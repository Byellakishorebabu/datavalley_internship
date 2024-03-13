import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        System.out.print("Enter the index where character needs to be replaced: ");
        int index = scanner.nextInt();
        
        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);
        
        String modifiedString = replaceCharacterAtIndex(originalString, index, replacementChar);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
        
        scanner.close();
    }
    
    public static String replaceCharacterAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        
        char[] chars = str.toCharArray();
        chars[index] = replacementChar;
        return new String(chars);
    }
}
