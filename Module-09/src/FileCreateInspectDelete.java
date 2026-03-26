import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileCreateInspectDelete {
    public static void main(String[] args) {
        Path path = Paths.get("network_config.txt");
        File file = path.toFile(); // for Scanner reading

        try {
            // Create and write text to file
            String content = "router R1\ninterface g0/1\nip address 10.1.1.1 255.255.255.0";
            Files.write(path, content.getBytes());
            System.out.println("File created and data written: " + path.toAbsolutePath());

            // Read and display file contents using Scanner (professor example style)
            System.out.println("\n=== FILE CONTENTS ===");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

            // Display file attributes
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("\n=== FILE DETAILS ===");
            System.out.println("Creation Time: " + attrs.creationTime());
            System.out.println("Last Modified: " + attrs.lastModifiedTime());
            System.out.println("File Size: " + attrs.size() + " bytes");
            System.out.println("Is Regular File? " + attrs.isRegularFile());
            System.out.println("Is Directory? " + attrs.isDirectory());

            // Ask user if they want to delete the file
            System.out.print("\nDelete file? (yes/no): ");
            Scanner input = new Scanner(System.in);
            if (input.nextLine().equalsIgnoreCase("yes")) {
                Files.delete(path);
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File kept for review.");
            }
            input.close();

        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}
