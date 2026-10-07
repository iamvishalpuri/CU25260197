import java.util.Scanner;

public class Q07_UsingThrows {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            checkAge(age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be numeric.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter age: 16
Error: Age must be at least 18.
*/
