import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q05_CopyOneFileToAnother {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("source.txt");
             FileWriter writer = new FileWriter("backup.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully from source.txt to backup.txt.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

/*
Output:
File copied successfully from source.txt to backup.txt.
*/
