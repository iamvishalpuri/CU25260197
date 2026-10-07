public class Q01_GenericBox {
    static class Box<T> {
        private final T value;
        Box(T value) { this.value = value; }
        T getValue() { return value; }
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(25);
        Box<String> stringBox = new Box<>("Java");
        Box<Double> doubleBox = new Box<>(99.5);
        System.out.println("Integer: " + integerBox.getValue());
        System.out.println("String: " + stringBox.getValue());
        System.out.println("Double: " + doubleBox.getValue());
    }
}

/*
Output:
Integer: 25
String: Java
Double: 99.5
*/
