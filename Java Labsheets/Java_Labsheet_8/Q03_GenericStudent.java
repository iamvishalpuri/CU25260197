public class Q03_GenericStudent {
    static class Student<T> {
        private final T id;
        Student(T id) { this.id = id; }
        T getId() { return id; }
    }

    public static void main(String[] args) {
        Student<Integer> student = new Student<>(25260197);
        System.out.println("Student ID: " + student.getId());
    }
}

/*
Output:
Student ID: 25260197
*/
