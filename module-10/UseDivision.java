/*
 * Student Justin Morrow | Date: 11/15/2025
 * CSD-402 Module 10: Create a base Division class and two subclasses to store and display division information
 *
 * References for main application to test Division classes:
 * Professors Example Files: Example_1_01, Example_1_20
 * Online Resource: https://www.geeksforgeeks.org/abstraction-in-java-2
 * Online Resource: https://www.geeksforgeeks.org/abstract-classes-in-java/
 */


/*
 * Steps 6: Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances)
 */

public class UseDivision {
    public static void main(String[] args) {

        // This creates the 2 InternationalDivision objects (Using opening date for the business as the account number)
        InternationalDivision internationalDivision1 = new InternationalDivision("Nintendo", "09231889", "Japan", "Japanese");
        InternationalDivision internationalDivision2 = new InternationalDivision("Samsung", "03011938", "South Korea", "Japanese");

        // This creates the 2 DomesticDivision objects (Using opening date for the business as the account number)
        DomesticDivision domesticDivision1 = new DomesticDivision("Chick-fil-A", "05231946", "Atlanta");
        DomesticDivision domesticDivision2 = new DomesticDivision("Verizon", "06302000", "New Jersey");

        // This displays all divisions
        System.out.println("\n-----------------------------------");
        System.out.println("International Divisions");
        System.out.println("-----------------------------------\n");
        internationalDivision1.display();
        internationalDivision2.display();
        System.out.println("\n-----------------------------------");
        System.out.println("Domestic Divisions");
        System.out.println("-----------------------------------\n");
        domesticDivision1.display();
        domesticDivision2.display();
    }
}