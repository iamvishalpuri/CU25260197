import java.io.File;
import java.util.Scanner;

public class Q07_DisplayFileInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter file or directory name: ");
            File file = new File(scanner.nextLine());
            System.out.println("Exists: " + file.exists());
            System.out.println("Name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } finally {
            scanner.close();
        }
    }
}

/*
Output:
Enter file or directory name: student.txt
Exists: true
Name: student.txt
Absolute path: /current/directory/student.txt
Size: 91 bytes
Is file: true
Is directory: false
Readable: true
Writable: true
*/
