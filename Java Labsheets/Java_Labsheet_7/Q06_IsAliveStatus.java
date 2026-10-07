public class Q06_IsAliveStatus {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Worker");

        System.out.println("Before start: " + worker.isAlive());
        worker.start();
        System.out.println("While running: " + worker.isAlive());
        worker.join();
        System.out.println("After finish: " + worker.isAlive());
    }
}

/*
Output:
Before start: false
While running: true
After finish: false
*/
