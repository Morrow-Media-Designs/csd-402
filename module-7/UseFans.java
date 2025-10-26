/*
 * Student Justin Morrow | Date: 10/25/2025
 * CSD-402 Module 8 Assignment 1 (New UseFans Class to utilize and display Fan objects from the Module 6 Fan Class)
 *
 * 
 * References:
 *  Professor Darrell's Weekly Assignment Example_1_01.java: No import Fan needed since both Fan.java and UseFans.java in same src folder
 *  Professor Darrell's Weekly Assignment Example_2_01.java: Using a method to display object details
 *  Professor Darrell's Weekly Assignment Example_3_01.java: Use of getters to access private fields
 *  Online Resource: https://www.w3schools.com/Java/java_arrays.asp
 *  Online Resource: https://www.w3schools.com/java/java_methods.asp
 */


// Step 4: Use the ‘this’ reference throughout the Fan class where allowed. Only used in Fan.java
public class UseFans {

    // Step 3: Create a method that takes a single instance of a Fan for displaying without using the toString() method.
    public static void fanDetails(Fan fan, int fanNumber) {
        System.out.println("Fan " + fanNumber + " Details:");
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println(); // Skip a row between each fan output
    }

    // Step 2: Create a method taking a collection of Fan instances for displaying without using the toString() method.
    public static void showFans(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) { // i loop counter starting at 0. Counts while less than Fan[4]
            fanDetails(fans[i], i + 1); // Since 0 based, i+1 allows numbering to start at 1
        }
    }

    public static void main(String[] args) {

        // Step 1: Create a collection of Fan instances.
        Fan[] fans; // Declaring the array fans that will hold the Fan objects from the Fan Class in Fan.java

        fans = new Fan[4]; // Create 4 Fan objects in the array fans

        // Initialize each Fan object (0 based so Fan 0 is the first fan and Fan 3 is the fourth fan)
        fans[0] = new Fan(); // The Default Constructor (Fan: off, Radius: 6, Color: white)
        fans[1] = new Fan(Fan.FAST, true, 10, "black");
        fans[2] = new Fan(Fan.MEDIUM, true, 8, "brown");
        fans[3] = new Fan(Fan.SLOW, true, 12, "grey");

        // Step 5: Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the collection.
        System.out.println("\nFan Collection Status:\n");
        showFans(fans); //
    }
}