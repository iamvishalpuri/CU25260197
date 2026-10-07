import java.util.Scanner;

public class Q06_UsingThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(scanner.nextLine());
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            System.out.println("Valid marks: " + marks);
        } catch (NumberFormatException e) {
            System.out.println("Error: Marks must be numeric.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
