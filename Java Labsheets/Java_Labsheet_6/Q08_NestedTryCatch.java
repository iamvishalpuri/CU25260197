import java.util.Scanner;

public class Q08_NestedTryCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        try {
            try {
                System.out.print("Enter array index: ");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println("Array element: " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }
            System.out.print("Enter divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            System.out.println("Division result: " + (100 / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter array index: 9
Inner catch: Invalid array index.
Enter divisor: 0
Outer catch: Cannot divide by zero.
*/
