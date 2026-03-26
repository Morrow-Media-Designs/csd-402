import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;

/**
 * FileManagementDemo.java
 *
 * This program demonstrates:
 * - Creating a file
 * - Writing and appending data
 * - Reading file content
 * - Displaying file attributes (size, last modified, etc.)
 * - Using both java.io.File and java.nio.file classes
 *
 * Inspired by Examples 1_30, 1_31, 1_32, and the Create/Write/Delete + NIO examples.
 */

public class FileManagementDemo {

    public static void main(String[] args) {
        // SECTION 1: Define our file and directory paths
        File file = new File("student_data.txt"); // relative path
        File directory = new File("student_files");

        System.out.println("=== FILE MANAGEMENT DEMONSTRATION ===\n");

        // SECTION 2: Create a directory if it doesn’t exist
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Created directory: " + directory.getName());
        }

        // SECTION 3: Create and write to a file (overwrite mode)
        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("\nWriting data to file (overwrite mode)...");
            writer.println("Student ID: 1001");
            writer.println("Name: Alice Johnson");
            writer.println("Course: Java Programming");
            writer.println("Grade: 95");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // SECTION 4: Append more data (using FileOutputStream)
        try (PrintWriter appendWriter = new PrintWriter(new FileOutputStream(file, true))) {
            System.out.println("\nAppending data to file...");
            appendWriter.println("----- Appended Data -----");
            appendWriter.println("Student ID: 1002");
            appendWriter.println("Name: Bob Smith");
            appendWriter.println("Course: Data Structures");
            appendWriter.println("Grade: 88");
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }

        // SECTION 5: Read file content using Scanner
        System.out.println("\nReading data from file...");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // SECTION 6: Display file properties using java.io.File methods
        System.out.println("\n=== FILE ATTRIBUTES (Using java.io.File) ===");
        System.out.println("File exists? " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("Is file? " + file.isFile());
        System.out.println("Can read? " + file.canRead());
        System.out.println("Can write? " + file.canWrite());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Last modified: " + new Date(file.lastModified()));

        // SECTION 7: Display file metadata using NIO (Paths, Files, BasicFileAttributes)
        System.out.println("\n=== FILE ATTRIBUTES (Using java.nio.file) ===");
        try {
            Path path = Paths.get("student_data.txt");
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File creation time: " + attrs.creationTime());
            System.out.println("Last access time: " + attrs.lastAccessTime());
            System.out.println("File size: " + attrs.size() + " bytes");
            System.out.println("Is directory? " + attrs.isDirectory());
            System.out.println("Is regular file? " + attrs.isRegularFile());
        } catch (IOException e) {
            System.out.println("Error retrieving file attributes: " + e.getMessage());
        }

        // SECTION 8: Delete the file (optional clean-up)
        System.out.println("\nWould you like to delete the file? (yes/no)");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File not deleted. You can view it in your project folder.");
        }

        input.close();
        System.out.println("\n=== END OF PROGRAM ===");
    }
}

