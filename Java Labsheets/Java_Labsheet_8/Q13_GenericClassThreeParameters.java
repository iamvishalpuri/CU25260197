public class Q13_GenericClassThreeParameters {
    static class Student<T, U, V> {
        private final T id;
        private final U name;
        private final V marks;
        Student(T id, U name, V marks) { this.id = id; this.name = name; this.marks = marks; }
        public String toString() { return id + " | " + name + " | " + marks; }
    }

    public static void main(String[] args) {
        Student<Integer, String, Double> s1 = new Student<>(1, "Aarav", 88.5);
        Student<Integer, String, Double> s2 = new Student<>(2, "Bhavna", 91.0);
        Student<Integer, String, Double> s3 = new Student<>(3, "Chirag", 79.5);
        System.out.println("ID | Name | Marks");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/*
Output:
ID | Name | Marks
1 | Aarav | 88.5
2 | Bhavna | 91.0
3 | Chirag | 79.5
*/
