public class Q15_DeadlockFixed {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread first = new Thread(() -> acquireLocks(lock1, lock2, "Thread 1"));
        Thread second = new Thread(() -> acquireLocks(lock1, lock2, "Thread 2"));

        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Both threads completed normally.");
    }

    private static void acquireLocks(Object firstLock, Object secondLock, String name) {
        synchronized (firstLock) {
            System.out.println(name + " locked Lock1");
            synchronized (secondLock) {
                System.out.println(name + " locked Lock2");
            }
        }
    }
}

/*
Output:
Thread 1 locked Lock1
Thread 1 locked Lock2
Thread 2 locked Lock1
Thread 2 locked Lock2
Both threads completed normally.
*/
