import java.util.TreeSet;

public class Q11_SortedStudentIDs {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();
        ids.add(104); ids.add(101); ids.add(103); ids.add(101); ids.add(105); ids.add(102);
        System.out.println("Unique sorted IDs: " + ids);
        System.out.println("First: " + ids.first());
        System.out.println("Last: " + ids.last());
        System.out.println("Higher than 102: " + ids.higher(102));
        System.out.println("Lower than 103: " + ids.lower(103));
    }
}

/*
Output:
Unique sorted IDs: [101, 102, 103, 104, 105]
First: 101
Last: 105
Higher than 102: 103
Lower than 103: 102
*/
