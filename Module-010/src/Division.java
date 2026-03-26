/*
 * Student Justin Morrow | Date: 11/15/2025
 * CSD-402 Module 10: Create a base Division class and two subclasses to store and display division information
 *
 * References for creating an Abstract superclass for the companies Divisions:
 * Professors Example Files: Example_1_01, Example_1_02, Example_1_20, Example_1_21
 * Online Resource: https://www.w3schools.com/java/java_abstract.asp
 * Online Resource: https://www.geeksforgeeks.org/abstract-classes-in-java/
 * Online Resource: https://www.w3schools.com/java/ref_keyword_abstract.asp
 */


/*
 * Step 1: Create an abstract Division class with fields for a company's division name and account number, and an
 * abstract display() method that will be defined in the subclasses.
 */

public abstract class Division {
    private String divisionName;
    private String accountNumber;

    // Step 2: Use a constructor in the superclass that requires values for both fields.
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // This is the Getter for the divisionName
    public String getDivisionName() {
        return divisionName;
    }

    // This is the Getter for the accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be used by subclasses in InternationalDivision.java and DomesticDivision.java
    public abstract void display();
}