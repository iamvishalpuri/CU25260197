public class Q07_JoinLongRunningTask extends Thread {
    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 10000: " + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread task = new Q07_JoinLongRunningTask();
        task.start();
        task.join();
        System.out.println("Task finished");
    }
}

/*
Output:
Sum from 1 to 10000: 50005000
Task finished
*/
