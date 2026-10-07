import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q09_ListIteratorModification {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aarav"); names.add("Bhavna"); names.add("Chirag");
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Bhavna")) iterator.set("Bharat");
            if (name.equals("Chirag")) iterator.add("Diya");
        }
        System.out.println("Modified list: " + names);
    }
}

/*
Output:
Modified list: [Aarav, Bharat, Chirag, Diya]
*/
