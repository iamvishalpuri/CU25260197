import java.util.ArrayList;

public class Q09_GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

/*
Output:
10
20
30
40
50
60
70
80
90
100
*/
