public class AgeValidator {
    
    public static void main(String[] args) {
        try {
            int age = 17; // Change the age value here
            validate(age);
            System.out.println("Welcome to vote.");
        } catch (ArithmeticException e) {
            System.out.println("Sorry, you are not eligible to vote.");
        }
    }
    
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above to vote.");
        }
    }
}
