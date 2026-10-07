import java.util.ArrayList;
import java.util.Scanner;

public class Q15_MiniGenericStudentManagement {
    static class Student<T, U, V> {
        private final T id;
        private final U name;
        private final V marks;
        Student(T id, U name, V marks) { this.id = id; this.name = name; this.marks = marks; }
        T getId() { return id; }
        public String toString() { return "ID: " + id + ", Name: " + name + ", Marks: " + marks; }
    }

    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> students = new ArrayList<>();
        students.add(new Student<>(101, "Aarav", 88.5));
        students.add(new Student<>(102, "Bhavna", 91.0));
        students.add(new Student<>(103, "Chirag", 79.5));
        students.add(new Student<>(104, "Diya", 84.0));
        students.add(new Student<>(105, "Esha", 95.5));

        System.out.println("All students:");
        for (Student<Integer, String, Double> student : students) System.out.println(student);
        System.out.println("Total students: " + students.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student<Integer, String, Double> student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");
        scanner.close();
    }
}

/*
Output:
All students:
ID: 101, Name: Aarav, Marks: 88.5
ID: 102, Name: Bhavna, Marks: 91.0
ID: 103, Name: Chirag, Marks: 79.5
ID: 104, Name: Diya, Marks: 84.0
ID: 105, Name: Esha, Marks: 95.5
Total students: 5
Enter student ID to search: 103
Student found: ID: 103, Name: Chirag, Marks: 79.5
*/
