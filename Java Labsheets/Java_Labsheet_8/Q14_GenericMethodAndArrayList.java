import java.util.ArrayList;

public class Q14_GenericMethodAndArrayList {
    static <T> void displayList(ArrayList<T> list) {
        for (T element : list) System.out.println(element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); numbers.add(20); numbers.add(30);
        ArrayList<String> names = new ArrayList<>();
        names.add("Aarav"); names.add("Bhavna"); names.add("Chirag");
        System.out.println("Integer list:");
        displayList(numbers);
        System.out.println("String list:");
        displayList(names);
    }
}

/*
Output:
Integer list:
10
20
30
String list:
Aarav
Bhavna
Chirag
*/
