import java.util.ArrayList;

public class Q10_GenericStringList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aarav");
        students.add("Bhavna");
        students.add("Chirag");
        students.add("Diya");
        students.add("Esha");
        System.out.println("Initial list: " + students);
        System.out.println("get(1): " + students.get(1));
        students.set(1, "Bharat");
        System.out.println("After set(1): " + students);
        students.remove("Chirag");
        System.out.println("After remove: " + students);
        System.out.println("Size: " + students.size());
    }
}

/*
Output:
Initial list: [Aarav, Bhavna, Chirag, Diya, Esha]
get(1): Bhavna
After set(1): [Aarav, Bharat, Chirag, Diya, Esha]
After remove: [Aarav, Bharat, Diya, Esha]
Size: 4
*/
