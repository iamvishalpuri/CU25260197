import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q10_ListVsSetExperiment {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 4, 1, 2, 3));
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("ArrayList preserves duplicates and insertion order.");
        System.out.println("HashSet removes duplicates and does not guarantee ordering.");
    }
}

/*
Output:
ArrayList: [4, 2, 4, 1, 2, 3]
HashSet: [1, 2, 3, 4]
ArrayList preserves duplicates and insertion order.
HashSet removes duplicates and does not guarantee ordering.
*/
