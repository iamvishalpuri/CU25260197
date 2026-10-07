public class Q14_Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread first = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked Lock1");
                sleepBriefly();
                synchronized (lock2) {
                    System.out.println("Thread 1 locked Lock2");
                }
            }
        });

        Thread second = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 locked Lock2");
                sleepBriefly();
                synchronized (lock1) {
                    System.out.println("Thread 2 locked Lock1");
                }
            }
        });

        first.start();
        second.start();
        first.join();
        second.join();
    }

    private static void sleepBriefly() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

/*
Output:
Thread 1 locked Lock1
Thread 2 locked Lock2
The program remains blocked because each thread waits for the lock held by the other.
Stop the program manually.
*/
