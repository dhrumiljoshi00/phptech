public class Main {
    public static void main(String[] args) {
        int num = 4; // Change the number here to calculate factorial for a different number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    // Method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
