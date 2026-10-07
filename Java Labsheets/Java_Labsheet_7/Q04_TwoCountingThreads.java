public class Q04_TwoCountingThreads extends Thread {
    public Q04_TwoCountingThreads(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Q04_TwoCountingThreads("Thread-A");
        Thread second = new Q04_TwoCountingThreads("Thread-B");
        first.start();
        second.start();
        first.join();
        second.join();
    }
}

/*
Output (order may change on each run):
Thread-A: 1
Thread-B: 1
Thread-A: 2
Thread-B: 2
Thread-A: 3
Thread-B: 3
Thread-A: 4
Thread-B: 4
Thread-A: 5
Thread-B: 5
*/
