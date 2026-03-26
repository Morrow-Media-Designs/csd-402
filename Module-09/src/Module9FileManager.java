/* Online References
* https://www.w3schools.com/java/
* https://www.w3schools.com/java/java_files.asp
* https://www.w3schools.com/java/java_user_input.asp
* https://www.w3schools.com/java/java_files_delete.asp
* https://stackoverflow.com/questions/43044927/using-equalsignorecase-in-if-statement-and-while-loop
* https://www.w3schools.com/java/java_conditions.asp
* References from Professor Darrell Payne
* Example_1_30.java, Example_1_31.java and Example_1_32.java
* */

import java.io.*;
import java.util.*;

public class Module9FileManager {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Prompt user for a router name to create a configuration file
        System.out.print("\nLet's create your router configuration file. If the file already exists, it will be appended.");
        System.out.print("\nEnter a name for your router: ");
        String configName = userInput.nextLine();
        // Concatenate the config file name with ".txt" as the file extension
        configName += ".txt";

        // Create a File object representing the router configuration file
        File router = new File(configName);

        PrintWriter pw;
        Scanner sc;

        try {
            // Open the file in append mode using FileOutputStream like Example_1_32
            pw = new PrintWriter(new FileOutputStream(router, true));

            // Write these 3 lines to the router configuration file
            pw.println("configure terminal");
            pw.println("interface gigabitethernet 0/1");
            pw.println("ip address 192.168.1.1 255.255.255.0\n");

            // Close the file after writing and print to the user it was created/appended successfully
            pw.close();
            System.out.println("\nYour router configuration file \"" + configName + "\" was created/appended successfully.");

            // Read and display the router config file contents like Example_1_31
            System.out.println("\n # --- Router Configuration File Contents --- #\n");
            sc = new Scanner(router);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            System.out.println(" # --- End of file --- #");

            // Display basic file attributes like Example_1_30 and w3schools reference
            System.out.println("\n\n # --- FILE DETAILS --- #\n");
            System.out.println("Does \"" + configName + "\" exist? " + router.exists());
            System.out.println("Can \"" + configName + "\" be read? " + router.canRead());
            System.out.println("Is \"" + configName + "\" writable? " + router.canWrite());
            System.out.println("File size: " + router.length() + " bytes");
            System.out.println("File last modified: " + new Date(router.lastModified()));
            System.out.println("File location: " + router.getAbsolutePath());


            // Ask the user if they want to delete the file as seen on Stack Overflow reference
            System.out.print("\nDeleted the file " + configName + " (Y/N)?: ");
            if (userInput.nextLine().equalsIgnoreCase("Y")) {
                if (router.delete()) {
                    System.out.println("Router configuration file deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            } else {
                System.out.println("File kept for review.");
            }

        // Catch any IOException that occurs like Example_1_32
        } catch (IOException ioe) {
            System.out.println("IOException has been thrown. - 1");
        }

        // Close the Scanner
        userInput.close();
    }
}