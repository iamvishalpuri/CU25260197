public class Q09_MultiplePriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            final int number = i + 1;
            threads[i] = new Thread(() -> System.out.println("Thread " + number + " printed"), "Thread-" + number);
            threads[i].setPriority(1 + (i * 2));
        }

        for (Thread thread : threads) {
            System.out.println(thread.getName() + " priority: " + thread.getPriority());
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }
}

/*
Output (completion order may vary because priority is only a scheduling hint):
Thread-1 priority: 1
Thread-2 priority: 3
Thread-3 priority: 5
Thread-4 priority: 7
Thread-5 priority: 9
Thread 1 printed
Thread 2 printed
Thread 3 printed
Thread 4 printed
Thread 5 printed
*/
