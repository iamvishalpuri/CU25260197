import java.util.Scanner;

public class Q11_BankWithdrawalSystem {
    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter withdrawal amount: ");
            double withdrawal = Double.parseDouble(scanner.nextLine());
            if (withdrawal < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }
            if (withdrawal > balance) {
                throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
            }
            System.out.printf("Withdrawal successful. Remaining balance: %.2f%n", balance - withdrawal);
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric values.");
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
            scanner.close();
        }
    }
}
