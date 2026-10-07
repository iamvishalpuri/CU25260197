import java.util.ArrayList;
import java.util.ListIterator;

public class Q13_ListIteratorReport {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java"); courses.add("Database"); courses.add("Networking");
        courses.add("Web Development"); courses.add("Operating Systems");

        System.out.println("Forward:");
        ListIterator<String> iterator = courses.listIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("Backward:");
        while (iterator.hasPrevious()) System.out.println(iterator.previous());

        iterator.next();
        System.out.println("nextIndex: " + iterator.nextIndex());
        System.out.println("previousIndex: " + iterator.previousIndex());
    }
}

/*
Output:
Forward:
Java
Database
Networking
Web Development
Operating Systems
Backward:
Operating Systems
Web Development
Networking
Database
Java
nextIndex: 1
previousIndex: 0
*/
