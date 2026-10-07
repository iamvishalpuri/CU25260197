import java.util.ArrayList;
import java.util.Scanner;

public class Q06_ArrayListSearching {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java"); courses.add("Python"); courses.add("Database"); courses.add("Networking");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Courses: " + courses);
        System.out.print("Enter a course to search: ");
        String course = scanner.nextLine();
        System.out.println(courses.contains(course) ? "Course exists." : "Course does not exist.");
        scanner.close();
    }
}

/*
Output:
Courses: [Java, Python, Database, Networking]
Enter a course to search: Java
Course exists.
*/
