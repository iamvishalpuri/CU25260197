import java.util.LinkedList;

public class Q08_LinkedListStudentQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addFirst("Bhavna");
        queue.addLast("Chirag");
        queue.addFirst("Aarav");
        System.out.println("Queue: " + queue);
        queue.removeFirst();
        queue.removeLast();
        System.out.println("After removals: " + queue);
    }
}

/*
Output:
Queue: [Aarav, Bhavna, Chirag]
After removals: [Bhavna]
*/
