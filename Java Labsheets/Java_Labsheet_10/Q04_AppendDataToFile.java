import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q04_AppendDataToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("students.txt", true)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();
            System.out.print("Enter marks: ");
            String marks = scanner.nextLine();
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks + System.lineSeparator());
            System.out.println("Student record appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending data: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter student name: Vishal Puri
Enter roll number: CU25260197
Enter marks: 92
Student record appended successfully.
*/
