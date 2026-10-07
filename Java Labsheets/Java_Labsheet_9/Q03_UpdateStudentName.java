import java.util.ArrayList;

public class Q03_UpdateStudentName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aarav"); students.add("Bhavna"); students.add("Chirag"); students.add("Diya");
        System.out.println("Original list: " + students);
        students.set(1, "Bharat");
        students.remove(3);
        System.out.println("Updated list: " + students);
    }
}

/*
Output:
Original list: [Aarav, Bhavna, Chirag, Diya]
Updated list: [Aarav, Bharat, Chirag]
*/
