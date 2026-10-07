import java.util.TreeSet;

public class Q05_SortedRollNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();
        int[] values = {108, 103, 110, 101, 106, 105, 109, 102, 107, 104};
        for (int value : values) rollNumbers.add(value);
        System.out.println("Sorted roll numbers: " + rollNumbers);
    }
}

/*
Output:
Sorted roll numbers: [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
*/
