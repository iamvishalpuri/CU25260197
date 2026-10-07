public class Q07_GenericMethod {
    static <T> void display(T value) {
        System.out.println(value + " (" + value.getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        display(10);
        display(12.5);
        display("Generic Java");
        display('A');
    }
}

/*
Output:
10 (Integer)
12.5 (Double)
Generic Java (String)
A (Character)
*/
