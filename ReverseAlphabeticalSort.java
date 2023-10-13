import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalSort {
    public static void main(String[] args) {
        // Read a word from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        scanner.close();

        // Convert the word to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array in reverse order
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        // Print the sorted characters
        String result = new String(charArray);
        System.out.println("Alphabetically in reverse order: " + result);
    }
}
