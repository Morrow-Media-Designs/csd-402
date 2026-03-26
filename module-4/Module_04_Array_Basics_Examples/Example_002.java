/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Creation of an Array Reference Does Not Create an Array Object
 */

public class Example_002{

  public static void main(String [] args){

    /*
     * Array reference created
     */
    int [] iArray = null;

    System.out.println();

    /*
     * Prints null, no array instance created
     */
    System.out.println("iArray = " + iArray);

    System.out.println();

    /*
     * Throws an exception,
     * No array elements
     */
    System.out.println("iArray[0] = " + iArray[0]);
  }
}