import java.util.Scanner;

public class Q01_ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int first = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int second = scanner.nextInt();
            System.out.println("Result: " + (first / second));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter first integer: 10
Enter second integer: 0
Error: Cannot divide by zero.
*/
