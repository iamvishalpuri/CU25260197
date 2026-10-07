public class Q09_ExceptionPropagation {
    static void method3() {
        int result = 10 / 0;
        System.out.println(result);
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main: Cannot divide by zero.");
        }
    }
}

/*
Output:
Exception handled in main: Cannot divide by zero.
*/
