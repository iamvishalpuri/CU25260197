import java.util.Scanner;

public class Q05_UsingFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number: ");
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println("Division result: " + (first / second));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}

/*
Output:
Enter first number: 15
Enter second number: 0
Error: Cannot divide by zero.
Program execution completed.
*/
