import java.util.Scanner;

public class ComputeExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter an integer:");
        int n = scanner.nextInt();

        int nn = n * 10 + n;        
        int nnn = nn * 10 + n;      
        int result = n + nn + nnn;

       
        System.out.println("Result: " + result);

     
        scanner.close();
    }
}
