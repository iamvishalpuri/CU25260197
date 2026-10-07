public class Q02_GenericResult {
    static class Result<T> {
        private final T marks;
        Result(T marks) { this.marks = marks; }
        T getMarks() { return marks; }
    }

    public static void main(String[] args) {
        Result<Integer> integerResult = new Result<>(85);
        Result<Double> doubleResult = new Result<>(91.5);
        System.out.println("Integer marks: " + integerResult.getMarks());
        System.out.println("Double marks: " + doubleResult.getMarks());
    }
}

/*
Output:
Integer marks: 85
Double marks: 91.5
*/
