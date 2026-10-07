import java.util.Scanner;

public class Q02_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array index: ");
            int index = scanner.nextInt();
            System.out.println("Element: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } finally {
            scanner.close();
        }
    }
}
