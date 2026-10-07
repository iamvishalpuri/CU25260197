import java.util.Scanner;

public class Q12_HospitalPatientAgeValidation {
    static class InvalidPatientAgeException extends Exception {
        InvalidPatientAgeException(String message) {
            super(message);
        }
    }

    static void validateAge(int age) throws InvalidPatientAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidPatientAgeException("Patient age must be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();
            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(scanner.nextLine());
            validateAge(age);
            System.out.println("Registration successful for " + name + ".");
        } catch (NumberFormatException e) {
            System.out.println("Error: Patient age must be numeric.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
