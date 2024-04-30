import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the greatest number
        int greatestNumber = num1;
        if (num2 > greatestNumber) {
            greatestNumber = num2;
        }
        if (num3 > greatestNumber) {
            greatestNumber = num3;
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatestNumber);

        // Close the scanner
        scanner.close();
    }
}
