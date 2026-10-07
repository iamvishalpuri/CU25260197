import java.util.ArrayList;

public class Q01_StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aarav"); students.add("Bhavna"); students.add("Chirag");
        students.add("Diya"); students.add("Esha"); students.add("Farhan");
        students.add("Gauri"); students.add("Harsh"); students.add("Ishita"); students.add("Karan");
        System.out.println("Students: " + students);
        System.out.println("Total size: " + students.size());
    }
}

/*
Output:
Students: [Aarav, Bhavna, Chirag, Diya, Esha, Farhan, Gauri, Harsh, Ishita, Karan]
Total size: 10
*/
