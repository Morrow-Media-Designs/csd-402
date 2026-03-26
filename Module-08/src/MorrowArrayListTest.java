/*
 * Student Justin Morrow | Date: 11/1/2025
 * CSD-402 Module 8 Assignment 1 (Class for user input of integers into ArrayList, Send to method, Display the largest integer entered)
 *
 * References:
 *  Professor Darrell's Weekly Assignment Example_1_23.java: ArrayList with Integer data type and loops
 *  Professor Darrell's Weekly Assignment Example_1_31.java: Casting when retrieving objects from an ArrayList. Testing discussed in video at 13:25
 *  Online Resource: https://www.w3schools.com/java/java_arrays_loop.asp
 *  Online Resource: https://www.w3schools.com/java/java_type_casting.asp
 */


// Import Scanner and ArrayList
import java.util.Scanner;
import java.util.ArrayList;


public class MorrowArrayListTest {
    public static void main(String[] args) {

        // Step 1: A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
        ArrayList<Integer> myList_01 = new ArrayList<Integer>();

        // Scanner object created to collect user input
        Scanner input = new Scanner(System.in);


        // User instructions
        System.out.println("\nPlease enter each integer as a whole number (Ex: 1, 99, 300. Not 1.5 or 23.7)");
        System.out.println("To end the program and display the highest number entered (Type 0 and press enter)\n");


        // User input variable to store the number entered
        int enteredNumber = 0;


        // Step 2: Loop to collect user input
        do {
            System.out.print("Enter a number: ");
            enteredNumber = input.nextInt();

            // Add the entered number to the ArrayList (including 0 once the user enters it)
            myList_01.add(enteredNumber);

        // End the loop once the user enters 0
        } while (enteredNumber != 0);


        // Step 3: The ArrayList is then to be sent to the method.
        Integer largestNumber = largest(myList_01);


        // Step 7: Write additional code for testing your method.
        System.out.println("\n\nNow lets show the test results from the numbers you entered\n");
        System.out.println("You entered the following numbers: " + myList_01);
        Integer testLargest = largest(myList_01);
        System.out.println("The largest number was: " + testLargest);
        System.out.println("This completes the test on the numbers you entered.\n\n");


        // Step 8: The method will return the largest value that is displayed to the user.
        System.out.println("\nThe largest number you entered was: " + largestNumber);
    }


    //Step 6: The method signature is to be public static Integer largest (ArrayList list).
    public static Integer largest(ArrayList list) {


        // Step 5: If the ArrayList is sent in empty, the method will then return 0.
        if (list == null || list.size() == 0) {
            return 0;
        }

        // Initialize largestValue with the first element
        Integer largestValue = (Integer) list.get(0);

        // Loop through the ArrayList to find the largest number
        for (int i = 0; i < list.size(); i++) {

            // Get each element/number and cast it to an Integer
            Integer currentValue = (Integer) list.get(i);

            // Compare current value with the largestValue and update largestValue if currentValue is larger
            if (currentValue > largestValue) {
                largestValue = currentValue;
            }
        }

        // Step 4: The method is then to return the largest value in the ArrayList.
        return largestValue;
    }
}