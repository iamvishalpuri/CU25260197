import java.util.Scanner;

public class Q03_NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number as text: ");
            String text = scanner.nextLine();
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The entered text is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter a number as text: abc
Error: The entered text is not a valid integer.
*/
