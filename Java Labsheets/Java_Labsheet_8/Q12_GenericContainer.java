public class Q12_GenericContainer {
    static class Container<T> {
        private T value;
        void add(T value) { this.value = value; }
        T get() { return value; }
    }

    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>();
        Container<String> stringContainer = new Container<>();
        Container<Double> doubleContainer = new Container<>();
        integerContainer.add(100);
        stringContainer.add("Java");
        doubleContainer.add(45.75);
        System.out.println("Integer: " + integerContainer.get());
        System.out.println("String: " + stringContainer.get());
        System.out.println("Double: " + doubleContainer.get());
    }
}

/*
Output:
Integer: 100
String: Java
Double: 45.75
*/
