import java.util.Random;

public class Q05_RandomNamedThreads {
    static class MessageThread extends Thread {
        private final String message;
        private final Random random = new Random();

        MessageThread(String name, String message) {
            super(name);
            this.message = message;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(random.nextInt(501));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println(getName() + ": " + message);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread reader = new MessageThread("Reader", "Reading data");
        Thread writer = new MessageThread("Writer", "Writing data");
        Thread logger = new MessageThread("Logger", "Logging activity");
        reader.start();
        writer.start();
        logger.start();
        reader.join();
        writer.join();
        logger.join();
    }
}

/*
Output (order varies because of random delays):
Writer: Writing data
Reader: Reading data
Logger: Logging activity
*/
