import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class Q15_MiniStudentCollectionManagement {
    static class Student {
        private final int id;
        private final String name;
        private final double marks;

        Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        int getId() { return id; }
        public String toString() { return id + " | " + name + " | " + marks; }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();
        addStudent(students, uniqueIds, sortedIds, new Student(103, "Chirag", 79.5));
        addStudent(students, uniqueIds, sortedIds, new Student(101, "Aarav", 88.5));
        addStudent(students, uniqueIds, sortedIds, new Student(105, "Esha", 95.5));
        addStudent(students, uniqueIds, sortedIds, new Student(102, "Bhavna", 91.0));
        addStudent(students, uniqueIds, sortedIds, new Student(104, "Diya", 84.0));

        System.out.println("Students in insertion order:");
        for (Student student : students) System.out.println(student);
        System.out.println("Student count: " + students.size());
        System.out.println("Unique IDs: " + uniqueIds);
        System.out.println("Sorted IDs: " + sortedIds);
        System.out.println("Search ID 102: " + findStudent(students, 102));

        ListIterator<Student> iterator = students.listIterator(students.size());
        System.out.println("Reverse order:");
        while (iterator.hasPrevious()) System.out.println(iterator.previous());
    }

    static void addStudent(ArrayList<Student> students, HashSet<Integer> ids, TreeSet<Integer> sortedIds, Student student) {
        students.add(student);
        ids.add(student.getId());
        sortedIds.add(student.getId());
    }

    static String findStudent(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) return student.toString();
        }
        return "Student not found";
    }
}

/*
Output:
Students in insertion order:
103 | Chirag | 79.5
101 | Aarav | 88.5
105 | Esha | 95.5
102 | Bhavna | 91.0
104 | Diya | 84.0
Student count: 5
Unique IDs: [101, 102, 103, 104, 105]
Sorted IDs: [101, 102, 103, 104, 105]
Search ID 102: 102 | Bhavna | 91.0
Reverse order:
104 | Diya | 84.0
102 | Bhavna | 91.0
105 | Esha | 95.5
101 | Aarav | 88.5
103 | Chirag | 79.5
*/
