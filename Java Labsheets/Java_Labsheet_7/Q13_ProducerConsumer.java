public class Q13_ProducerConsumer {
    static class SingleSlotBuffer {
        private Integer value;

        synchronized void produce(int number) throws InterruptedException {
            while (value != null) {
                wait();
            }
            value = number;
            System.out.println("Produced: " + number);
            notifyAll();
        }

        synchronized int consume() throws InterruptedException {
            while (value == null) {
                wait();
            }
            int number = value;
            value = null;
            System.out.println("Consumed: " + number);
            notifyAll();
            return number;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SingleSlotBuffer buffer = new SingleSlotBuffer();
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}

/*
Output:
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Produced: 6
Consumed: 6
Produced: 7
Consumed: 7
Produced: 8
Consumed: 8
Produced: 9
Consumed: 9
Produced: 10
Consumed: 10
*/
