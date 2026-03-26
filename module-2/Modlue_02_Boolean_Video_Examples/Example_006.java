/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Boolean Data Type

 * Format Specifier
 * Boolean %b
 */
import java.util.Scanner;

public class Example_006{

  public static void main(String [] args){

    boolean boolResult;
    int firstIntInput;
    int secondIntInput;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first integer to be compared:\n");
    firstIntInput = input.nextInt();
    
    System.out.println("Enter the second integer to be compared:\n");
    secondIntInput = input.nextInt();

    boolResult = firstIntInput == secondIntInput;

    System.out.printf("The equality of input values %d and %d is %b.%n%n", firstIntInput, secondIntInput, boolResult);
  }
}