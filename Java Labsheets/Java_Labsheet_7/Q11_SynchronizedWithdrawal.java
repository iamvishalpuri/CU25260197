public class Q11_SynchronizedWithdrawal {
    static class BankAccount {
        private int balance = 1000;

        synchronized void withdraw(int amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance for withdrawal of " + amount);
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
        Thread first = new Thread(withdrawalTask);
        Thread second = new Thread(withdrawalTask);
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Final balance: " + account.getBalance());
    }
}

/*
Output:
[Insufficient balance messages may be printed]
Final balance: 0
*/
