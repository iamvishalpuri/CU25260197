import java.util.HashSet;

public class Q04_UniqueDepartments {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science"); departments.add("Management");
        departments.add("Computer Science"); departments.add("Commerce");
        departments.add("Management");
        System.out.println("Unique departments: " + departments);
    }
}

/*
Output:
Unique departments: [Computer Science, Management, Commerce]
*/
