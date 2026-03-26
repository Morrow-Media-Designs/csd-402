import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FileMiniProgramAppend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename to create or append to: ");
        String filename = input.nextLine();

        Path path = Paths.get(filename);
        File file = path.toFile();

        // Check if file exists
        if (file.exists()) {
            System.out.println("\nFile already exists: " + file.getAbsolutePath());
        } else {
            System.out.println("\nFile does not exist and will be created.");
        }

        try {
            // Write multiple lines to the file (append if exists)
            List<String> lines = Arrays.asList(
                    "router R1",
                    "interface g0/1",
                    "ip address 10.1.1.1 255.255.255.0"
            );
            Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("\nData written to file: " + path.toAbsolutePath());

            // Read and count lines
            System.out.println("\n=== FILE CONTENTS ===");
            Scanner sc = new Scanner(file);
            int lineCount = 0;
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                lineCount++;
            }
            sc.close();
            System.out.println("Total lines: " + lineCount);

            // Display file attributes
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("\n=== FILE DETAILS ===");
            System.out.println("Creation Time: " + attrs.creationTime());
            System.out.println("Last Modified: " + attrs.lastModifiedTime());
            System.out.println("File Size: " + attrs.size() + " bytes");
            System.out.println("Is Regular File? " + attrs.isRegularFile());
            System.out.println("Is Directory? " + attrs.isDirectory());
            System.out.println("Can Read? " + file.canRead());
            System.out.println("Can Write? " + file.canWrite());

            // Optionally delete the file
            System.out.print("\nDelete file? (yes/no): ");
            if (input.nextLine().equalsIgnoreCase("yes")) {
                Files.delete(path);
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File kept for review.");
            }

        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }

        input.close();
    }
}
