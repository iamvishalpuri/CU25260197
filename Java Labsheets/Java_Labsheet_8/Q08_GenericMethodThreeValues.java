public class Q08_GenericMethodThreeValues {
    static <T> void display(T first, T second, T third) {
        System.out.println(first + ", " + second + ", " + third);
    }

    public static void main(String[] args) {
        display(1, 2, 3);
        display("A", "B", "C");
        display(1.1, 2.2, 3.3);
    }
}

/*
Output:
1, 2, 3
A, B, C
1.1, 2.2, 3.3
*/
