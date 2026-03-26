/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Create array objects
 * Assign values
 * Arrays of primitive types
 */

public class Example_005{

  public static void main(String[] args){

    /*
     *  Allowed
     *  Array object references created
     *    int iArrayR1[], iArrayR2[], iArrayR3[];
     *
     *  Allowed
     *  Another option
     *    int [] iArrayS1, iArrayS2, iArrayS3;
     *
     *  Error? - Declares one array and two integers
     *    int iArrayT1 [], iArrayT2, iArrayT3;
     */

    /*
     * Declares three arrays
     */
     int [] iArray1;
     int [] iArray2;
     int [] iArray3;
     
    /*
     * Create array objects - default values in the arrays
     *
     * int = 0s
     */
    iArray1 = new int [3];
    iArray2 = new int [3];
    iArray3 = new int [3];

    /* 
     * Printing array values
     * Here I use a numeric literal, NOT the best approach, a BAD practice
     * Prints default values
     */
    for(int i = 0; i < 3; i++){

      System.out.println("iArray1[" + i + "] = " + iArray1[i] + 
                         "\n\tiArray2[" + i + "] = " + iArray2[i] + 
                         "\n\t\tiArray3[" + i + "] = " + iArray3[i] + "\n");
    }

    System.out.println("\n");

    /*
     * Assign array values
     * Avoid using a numeric literal as I did here
     */
    for(int i = 0; i < 3; i++){

      iArray1[i] = i;
      iArray2[i] = i + 4;
      iArray3[i] = 4 - i;
    }

    /* 
     * Printing array values
     * Here I use a numeric literal, not the best approach
     */
    for(int i = 0; i < 3; i++){

      System.out.println("iArray1[" + i + "] = " + iArray1[i] + 
                         "\n\tiArray2[" + i + "] = " + iArray2[i] + 
                         "\n\t\tiArray3[" + i + "] = " + iArray3[i] + "\n");
    }
  }
}