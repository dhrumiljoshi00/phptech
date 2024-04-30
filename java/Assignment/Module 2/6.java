import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer number less than ten billion: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }

            System.out.println("Number of digits in the number: " + count);
        }

        scanner.close();
    }
}
