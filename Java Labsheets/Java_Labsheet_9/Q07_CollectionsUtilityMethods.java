import java.util.ArrayList;
import java.util.Collections;

public class Q07_CollectionsUtilityMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 2, 8, 2, 6, 10, 2);
        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Frequency of 2: " + Collections.frequency(numbers, 2));
    }
}

/*
Output:
Original: [4, 2, 8, 2, 6, 10, 2]
Sorted: [2, 2, 2, 4, 6, 8, 10]
Reversed: [10, 8, 6, 4, 2, 2, 2]
Maximum: 10
Minimum: 2
Frequency of 2: 3
*/
