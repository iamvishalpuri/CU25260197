import java.util.Scanner;

public class Q13_PharmaceuticalDrugDosageValidation {
    static class InvalidDosageException extends Exception {
        InvalidDosageException(String message) {
            super(message);
        }
    }

    static void validateDosage(int dosage) throws InvalidDosageException {
        if (dosage < 1 || dosage > 1000) {
            throw new InvalidDosageException("Dosage must be between 1 mg and 1000 mg.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patient = scanner.nextLine();
            System.out.print("Enter drug name: ");
            String drug = scanner.nextLine();
            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(scanner.nextLine());
            validateDosage(dosage);
            System.out.println("Dosage approved for " + patient + ": " + drug + " - " + dosage + " mg.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be numeric.");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
            scanner.close();
        }
    }
}
