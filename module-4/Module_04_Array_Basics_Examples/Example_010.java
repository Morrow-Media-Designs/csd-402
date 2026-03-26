/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declare Array references
 * Create Array objects
 * Assign values
 */
public class Example_010{

  public static void main(String[] args){

    /*
     * Create array reference
     */
    String [] sArray = null;

    /*
     * Create array
     *
     * All elements receive default values
     *
     * String null
     */
    sArray = new String [7];

    /*
     * Assign values
     */
    sArray[0] = "One";
    sArray[1] = "Two";
    sArray[2] = "Three";
    sArray[3] = "Four";
    sArray[4] = "Five";
    sArray[5] = "Six";
    sArray[6] = "Seven";

    for(int i = 0; i < sArray.length; i++){

      System.out.println("sArray[" + i + "] = " + sArray[i]);
    }
  }
}