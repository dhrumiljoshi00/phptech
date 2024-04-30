import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character from the user
        System.out.println("Enter a single character from the alphabet:");
        char ch = scanner.next().charAt(0);

        // Check if the input is a letter and of length 1
        if (Character.isLetter(ch) && String.valueOf(ch).length() == 1) {
            // Convert character to lowercase for easy comparison
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            // If input is not a single letter, print error message
            System.out.println("Error: Please enter a single character from the alphabet.");
        }

        // Close the scanner
        scanner.close();
    }
}
