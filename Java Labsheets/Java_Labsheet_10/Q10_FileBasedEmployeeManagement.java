import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q10_FileBasedEmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Employee " + i);
                System.out.print("Employee ID: ");
                String id = scanner.nextLine();
                System.out.print("Employee name: ");
                String name = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();
                System.out.print("Salary: ");
                String salary = scanner.nextLine();
                writer.write(id + " | " + name + " | " + department + " | " + salary + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error creating employee file: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter employee ID to search: ");
        String searchId = scanner.nextLine();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(searchId + " |")) {
                    System.out.println("Employee record: " + line);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading employee file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Employee 1
Employee ID: E101
Employee name: Aarav Sharma
Department: IT
Salary: 45000
[Employee 2 and Employee 3 entered similarly]
Enter employee ID to search: E101
Employee record: E101 | Aarav Sharma | IT | 45000
*/
