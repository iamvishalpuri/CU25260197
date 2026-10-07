public class Q02_RunnableInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Print " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Q02_RunnableInterface(), "RunnableThread");
        thread.start();
        thread.join();
    }
}

/*
Output:
RunnableThread - Print 1
RunnableThread - Print 2
RunnableThread - Print 3
RunnableThread - Print 4
RunnableThread - Print 5
*/
