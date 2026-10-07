public class Q10_RaceCondition {
    static class BankAccount {
        private int balance = 1000;

        void withdraw(int amount) {
            if (balance >= amount) {
                int currentBalance = balance;
                Thread.yield();
                balance = currentBalance - amount;
            }
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        Runnable withdrawalTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(1);
            }
        };
        Thread first = new Thread(withdrawalTask, "Withdrawer-1");
        Thread second = new Thread(withdrawalTask, "Withdrawer-2");
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Expected balance: -1000");
        System.out.println("Actual balance: " + account.getBalance());
        System.out.println("The result may be incorrect because of a race condition.");
    }
}

/*
Output (actual balance can vary):
Expected balance: -1000
Actual balance: 0
The result may be incorrect because of a race condition.
*/
