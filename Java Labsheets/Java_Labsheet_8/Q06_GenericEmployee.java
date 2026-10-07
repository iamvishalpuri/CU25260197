public class Q06_GenericEmployee {
    static class Employee<T, U> {
        private final T id;
        private final U name;
        Employee(T id, U name) { this.id = id; this.name = name; }
        void display() { System.out.println("Employee ID: " + id + ", Name: " + name); }
    }

    public static void main(String[] args) {
        Employee<Integer, String> employee = new Employee<>(501, "Aarav Sharma");
        employee.display();
    }
}

/*
Output:
Employee ID: 501, Name: Aarav Sharma
*/
