import java.util.Scanner;

public class Q04_MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter first number: ");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number: ");
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println("Division result: " + (first / second));
            System.out.print("Enter array index: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Array element: " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter first number: 20
Enter second number: 0
Error: Cannot divide by zero.
*/
