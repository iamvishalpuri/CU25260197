public class Q12_SynchronizedBlock {
    static class BankAccount {
        private int balance = 1000;
        private final Object lock = new Object();

        void withdraw(int amount) {
            synchronized (lock) {
                if (balance >= amount) {
                    balance -= amount;
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }

        int getBalance() {
            synchronized (lock) {
                return balance;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(1);
            }
        };
        Thread first = new Thread(task);
        Thread second = new Thread(task);
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
