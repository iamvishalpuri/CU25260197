public class Q03_ThreadNamePriority {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Original name: " + mainThread.getName());
        System.out.println("Original priority: " + mainThread.getPriority());
        mainThread.setName("JavaMainThread");
        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated name: " + mainThread.getName());
        System.out.println("Updated priority: " + mainThread.getPriority());
    }
}

/*
Output:
Original name: main
Original priority: 5
Updated name: JavaMainThread
Updated priority: 10
*/
