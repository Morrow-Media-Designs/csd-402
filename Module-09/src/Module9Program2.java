/*
 * Student Justin Morrow | Date: 11/9/2025
 * CSD-402 Module 9 Program 2 (File creation/appending/reading and display contents using Java I/O classes)
 *
 * References:
 * Example_1_30.java, Example_1_31.java and Example_1_32.java
 * https://www.w3schools.com/java/
 * https://www.w3schools.com/java/java_files.asp
 * https://www.w3schools.com/java/java_user_input.asp
 * https://www.w3schools.com/java/java_files_delete.asp
 * https://stackoverflow.com/questions/43044927/using-equalsignorecase-in-if-statement-and-while-loop
 * */


import java.io.*;
import java.util.*;

public class Module9Program2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Step 1) Write a program to create a new file titled data.file
        File dataFile = new File("data.file");

        PrintWriter pw = null;
        Scanner sc = null;
        Random rand = new Random();

        try {
            // Steps 2) if the file does not exist. Then write to the new file, adding 10 randomly generated numbers. like Example_1_30
            if (dataFile.exists()) {
                pw = new PrintWriter(new FileOutputStream(dataFile, true));
                System.out.println("\nThe file '" + dataFile + "' already exists. Appending 10 random numbers now");
            }
                // Step 3) if the file does exist append 10 randomly generated numbers to a previous file. like Example_1_30
                else {
                    pw = new PrintWriter(new FileOutputStream(dataFile));
                    System.out.println("\nThe File '" + dataFile + "' does not exist. Creating '" + dataFile + "' file and adding 10 random numbers now");
                }

            // Display file details. Since I did this in the weekly writing assignment I thought it would look good here
            System.out.println("\nFile location: " + dataFile.getAbsolutePath());
            System.out.println("File last modified: " + new Date(dataFile.lastModified()));

            // Step 4) Each integer is to be separated by a space
            for (int i = 0; i < 10; i++) {
                pw.print(rand.nextInt(100) + " ");
            }

            // After writing the 10 random numbers this enters to the next row
            pw.println();

            // Step 5) Close the file
            pw.close();

            // Step 6) Reopen the file and read the data from the file and display it
            sc = new Scanner(dataFile);
            System.out.println("\nBelow are the random numbers in the '" + dataFile + "':");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }

            // Catch any IOException that occurs like Example_1_32
            catch (IOException exception) {
                System.out.println("IOException has been thrown. - 1");
            }

        // Close the Scanner
        userInput.close();
    }
}