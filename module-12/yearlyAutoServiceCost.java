/*
 * Justin Morrow | Date: 11/22/2025
 * CSD-402 Module 12: Create overloaded yearlyService methods for calculating auto service costs
 *
 * References:
 * Galles Chevrolet Service Center: https://www.galleschevy.com/service/
 * Online Resource: https://www.w3schools.com/java/java_methods_overloading.asp
 */

public class yearlyAutoServiceCost {

    // Fixed pricing (Standard Service/Multipoint inspection, Oil Change, Tire Rotation, Coupon)
    public static final double standardService = 24.95;
    public static final double oilChange = 69.95;
    public static final double tireRotation = 19.95;
    public static final double coupon = 25.00;


    // yearlyService(no parameters) - Will return the standard service charge.
    public static double yearlyService() {
        return standardService;
    }

    // Will return the standard service charge with an added oil change fee.
    public static double yearlyService(double oilChangeFee) {
        return standardService + oilChangeFee;
    }

    // Will return the standard service charge with an added oil change fee and a tire rotation charge.
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return standardService + oilChangeFee + tireRotationCharge;
    }

    // Will return the standard service charge with an added oil change fee, a tire rotation charge,
    // along with a coupon amount that will be deducted from the total cost.
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        return standardService + oilChangeFee + tireRotationCharge - couponAmount;
    }


    // Write a main method that will test each of these methods two times.
    // I don't fully understand if there is supposed to be a difference in running it twice?
    public static void main(String[] args) {

        System.out.println("\nWelcome to Galles Chevrolet\nHome of Albuquerque's #1 Chevy Service Department\n");

        System.out.println("\n---------------------------------------------");
        System.out.println("* Yearly Auto Service: $24.95\n(Multipoint Check and Fluid Top Off)");
        System.out.println("---------------------------------------------\n");

        // Test yearlyService(no parameters) method twice
        System.out.println("Test 1: $" + yearlyService());
        System.out.println("Test 2: $" + yearlyService());

        System.out.println("\n---------------------------------------------");
        System.out.println("* Yearly Auto Service: $24.95\n(Multipoint Check and Fluid Top Off)\n* Synthetic Oil Change: $69.95\n(Up to 6 quarts)");
        System.out.println("---------------------------------------------\n");

        // Test yearlyService(one parameter) method twice
        System.out.println("Test 1: $" + yearlyService(oilChange));
        System.out.println("Test 2: $" + yearlyService(oilChange));

        System.out.println("\n---------------------------------------------");
        System.out.println("* Yearly Auto Service: $24.95\n(Multipoint Check and Fluid Top Off)\n* Synthetic Oil Change: $69.95\n(Up to 6 quarts)\n* Tire Rotation: $19.95");
        System.out.println("---------------------------------------------\n");

        // Test yearlyService(two parameters) method twice
        System.out.println("Test 1: $" + yearlyService(oilChange, tireRotation));
        System.out.println("Test 2: $" + yearlyService(oilChange, tireRotation));

        System.out.println("\n---------------------------------------------");
        System.out.println("* Yearly Auto Service: $24.95\n(Multipoint Check and Fluid Top Off)\n* Synthetic Oil Change: $69.95\n(Up to 6 quarts)\n* Tire Rotation: $19.95\n* Coupon: $25\n(Multi-Service Discount)");
        System.out.println("---------------------------------------------\n");

        // Test yearlyService(three parameters) method twice
        System.out.println("Test 1: $" + yearlyService(oilChange, tireRotation, coupon));
        System.out.println("Test 2: $" + yearlyService(oilChange, tireRotation, coupon));
    }
}

