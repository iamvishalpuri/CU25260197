import java.util.ArrayList;
import java.util.Scanner;

public class Q11_SearchInGenericList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) numbers.add(i * 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers: " + numbers);
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        System.out.println(numbers.contains(target) ? "Number exists." : "Number does not exist.");
        scanner.close();
    }
}

/*
Output:
Numbers: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
Enter a number to search: 30
Number exists.
*/
