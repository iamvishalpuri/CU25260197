import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q01_CreateAndWriteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("student.txt")) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();
            System.out.print("Enter course: ");
            String course = scanner.nextLine();
            System.out.print("Enter semester: ");
            String semester = scanner.nextLine();
            writer.write("Student Name: " + name + System.lineSeparator());
            writer.write("Roll Number: " + rollNumber + System.lineSeparator());
            writer.write("Course: " + course + System.lineSeparator());
            writer.write("Semester: " + semester + System.lineSeparator());
            System.out.println("Student file created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter student name: Vishal Puri
Enter roll number: CU25260197
Enter course: BCA
Enter semester: 3rd Sem - A
Student file created and data written successfully.
*/
