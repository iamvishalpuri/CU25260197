import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q08_CountVowelsConsonantsDigitsSpaces {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int value;
            while ((value = reader.read()) != -1) {
                char character = (char) value;
                if (Character.isWhitespace(character)) {
                    spaces++;
                } else if (Character.isDigit(character)) {
                    digits++;
                } else if (Character.isLetter(character)) {
                    if ("aeiouAEIOU".indexOf(character) >= 0) vowels++;
                    else consonants++;
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("Error reading input.txt: " + e.getMessage());
        }
    }
}

/*
Sample input.txt:
Java 19

Output:
Vowels: 2
Consonants: 4
Digits: 2
Spaces: 1
*/
