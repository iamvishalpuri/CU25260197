import java.util.Scanner;

public class Q15_PharmacyInventorySystem {
    static class InvalidQuantityException extends Exception {
        InvalidQuantityException(String message) {
            super(message);
        }
    }

    static class InsufficientMedicineStockException extends Exception {
        InsufficientMedicineStockException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter medicine name: ");
            String medicine = scanner.nextLine();
            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(scanner.nextLine());
            if (available < 0 || required < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative.");
            }
            if (required > available) {
                throw new InsufficientMedicineStockException("Required quantity exceeds available stock.");
            }
            System.out.println("Inventory issued: " + required + " units of " + medicine + ".");
        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity must be numeric.");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
            scanner.close();
        }
    }
}
