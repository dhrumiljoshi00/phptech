import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }

    public static String calculateGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "A";
        } else if (marks >= 81 && marks <= 90) {
            return "B";
        } else if (marks >= 71 && marks <= 80) {
            return "B";
        } else if (marks >= 61 && marks <= 70) {
            return "C";
        } else if (marks >= 51 && marks <= 60) {
            return "D";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks >= 0 && marks <= 40) {
            return "Fail";
        } else {
            return "Invalid Marks";
        }
    }
}
