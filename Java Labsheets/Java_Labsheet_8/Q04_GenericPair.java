public class Q04_GenericPair {
    static class Pair<T, U> {
        private final T first;
        private final U second;
        Pair(T first, U second) { this.first = first; this.second = second; }
        void display() { System.out.println("Employee ID: " + first + ", Employee Name: " + second); }
    }

    public static void main(String[] args) {
        Pair<Integer, String> employee = new Pair<>(101, "Vishal Puri");
        employee.display();
    }
}

/*
Output:
Employee ID: 101, Employee Name: Vishal Puri
*/
