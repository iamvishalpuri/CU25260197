import java.util.Scanner;

public class Q14_OnlineExaminationSystem {
    static class InvalidExamMarksException extends Exception {
        InvalidExamMarksException(String message) {
            super(message);
        }
    }

    static void validateMarks(int marks) throws InvalidExamMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidExamMarksException("Exam marks must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student's marks: ");
            int marks = Integer.parseInt(scanner.nextLine());
            validateMarks(marks);
            System.out.println(marks >= 40 ? "Result: PASS" : "Result: FAIL");
        } catch (NumberFormatException e) {
            System.out.println("Error: Marks must be numeric.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Examination result processing completed.");
            scanner.close();
        }
    }
}

/*
Output:
Enter student's marks: 35
Result: FAIL
Examination result processing completed.
*/
