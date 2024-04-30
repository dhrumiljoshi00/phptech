import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average;

        // Input 5 numbers from the keyboard
        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            sum += num; // Add the current number to the sum
        }

        // Calculate average
        average = (double) sum / 5;

        // Print sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}
