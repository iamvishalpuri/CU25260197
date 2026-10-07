import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q09_StudentRecordFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("student_records.txt")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Student " + i);
                System.out.print("Roll number: ");
                String rollNumber = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Course: ");
                String course = scanner.nextLine();
                System.out.print("Marks: ");
                String marks = scanner.nextLine();
                writer.write(rollNumber + " | " + name + " | " + course + " | " + marks + System.lineSeparator());
            }
            System.out.println("Five student records stored successfully.");
        } catch (IOException e) {
            System.out.println("Error writing records: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"))) {
            System.out.println("Student records:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading records: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Student 1
Roll number: 101
Name: Aarav
Course: BCA
Marks: 88
[Student 2 to Student 5 entered similarly]
Five student records stored successfully.
Student records:
101 | Aarav | BCA | 88
102 | Bhavna | BCA | 91
103 | Chirag | BCA | 79
104 | Diya | BCA | 84
105 | Esha | BCA | 95
*/
