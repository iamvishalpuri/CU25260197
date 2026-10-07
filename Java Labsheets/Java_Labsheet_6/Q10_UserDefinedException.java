import java.util.Scanner;

public class Q10_UserDefinedException {
    static class InvalidMarksException extends Exception {
        InvalidMarksException(String message) {
            super(message);
        }
    }

    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be within the range 0-100.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(scanner.nextLine());
            validateMarks(marks);
            System.out.println("Marks are valid: " + marks);
        } catch (NumberFormatException e) {
            System.out.println("Error: Marks must be numeric.");
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter marks: -5
Error: Marks must be within the range 0-100.
*/
