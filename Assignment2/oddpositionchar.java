public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }
    
    public static void printOddPositionCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}