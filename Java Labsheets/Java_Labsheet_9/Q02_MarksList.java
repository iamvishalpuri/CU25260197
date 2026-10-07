import java.util.ArrayList;

public class Q02_MarksList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78); marks.add(85); marks.add(92); marks.add(88); marks.add(74);
        System.out.println("Marks: " + marks);
        System.out.println("First: " + marks.get(0));
        System.out.println("Middle: " + marks.get(2));
        System.out.println("Last: " + marks.get(marks.size() - 1));
    }
}

/*
Output:
Marks: [78, 85, 92, 88, 74]
First: 78
Middle: 92
Last: 74
*/
