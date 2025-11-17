/*
 * Student Justin Morrow | Date: 11/15/2025
 * CSD-402 Module 10: Create a base Division class and two subclasses to store and display division information
 *
 * References for the Subclass of Division used for the International divisions:
 * Professors Example Files: Example_1_01, Example_1_02, Example_1_20
 * Online Resource: https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/
 * Online Resource: https://www.geeksforgeeks.org/abstraction-in-java-2
 */


/*
 * Steps 3: Create the subclass InternationalDivision
 * Steps 4: The InternationalDivision class includes a field for the country in which the division is located,
 * a field for the language spoken, and a constructor that requires all fields when created.
 */

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // The Constructor for the fields: divisionName, accountNumber, country,and  language
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // This is the Getter for the Country
    public String getCountry() {
        return country;
    }

    // This is the Getter for Language
    public String getLanguage() {
        return language;
    }

    // This is the abstract display method from Division to print the required divisional details
    @Override
    public void display() {
        //System.out.println("International Division:");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language + "\n");
    }
}