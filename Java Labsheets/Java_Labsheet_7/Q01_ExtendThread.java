public class Q01_ExtendThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Print " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Q01_ExtendThread();
        thread.start();
        thread.join();
    }
}

/*
Output:
Thread-0 - Print 1
Thread-0 - Print 2
Thread-0 - Print 3
Thread-0 - Print 4
Thread-0 - Print 5
*/
