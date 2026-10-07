public class Q08_ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread highPriority = new Thread(() -> System.out.println("High-priority thread executed"), "HighPriority");
        Thread lowPriority = new Thread(() -> System.out.println("Low-priority thread executed"), "LowPriority");
        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);
        System.out.println(highPriority.getName() + " priority: " + highPriority.getPriority());
        System.out.println(lowPriority.getName() + " priority: " + lowPriority.getPriority());
        highPriority.start();
        lowPriority.start();
        highPriority.join();
        lowPriority.join();
    }
}

/*
Output (execution order is scheduler-dependent):
HighPriority priority: 10
LowPriority priority: 1
High-priority thread executed
Low-priority thread executed
*/
