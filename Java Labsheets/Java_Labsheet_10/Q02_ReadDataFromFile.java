import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q02_ReadDataFromFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
Output:
Student Name: Vishal Puri
Roll Number: CU25260197
Course: BCA
Semester: 3rd Sem - A
*/
