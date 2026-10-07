import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q06_SearchForWordInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int occurrences = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            System.out.print("Enter word to search: ");
            String target = scanner.nextLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(target)) {
                        occurrences++;
                    }
                }
            }
            if (occurrences > 0) {
                System.out.println("Word found.");
                System.out.println("Number of occurrences: " + occurrences);
            } else {
                System.out.println("Word not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading notes.txt: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter word to search: Java
Word found.
Number of occurrences: 3
*/
