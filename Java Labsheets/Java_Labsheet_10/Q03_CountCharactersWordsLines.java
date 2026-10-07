import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q03_CountCharactersWordsLines {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            System.out.println("Error reading data.txt: " + e.getMessage());
        }
    }
}

/*
Sample data.txt:
Java file handling is useful.
It stores and reads data.

Output:
Lines: 2
Words: 9
Characters: 55
*/
