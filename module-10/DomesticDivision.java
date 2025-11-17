/*
 * Student Justin Morrow | Date: 11/15/2025
 * CSD-402 Module 10: Create a base Division class and two subclasses to store and display division information
 *
 * References for the Subclass of Division used for the Domestic divisions:
 * Professors Example Files: Example_1_01, Example_1_02, Example_1_20
 * Online Resource: https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
 * Online Resource: https://www.geeksforgeeks.org/abstraction-in-java-2
 */


/*
 * Steps 3: Create the subclass InternationalDivision
 * Steps 5: The InternationalDivision class includes a field for the country in which the division is located,
 * a field for the language spoken, and a constructor that requires all fields when created.
 */

public class DomesticDivision extends Division {
    private String state;

    // The Constructor for the fields: divisionName, accountNumber, and  state
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // This is the Getter for the State
    public String getState() {
        return state;
    }

    // This is the abstract display method from Division to print the required divisional details
    @Override
    public void display() {
        //System.out.println("Domestic Division:");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state + "\n");
    }
}
