/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using short-cut notation to assign initial values
 * Create and initialize an array in a single statement
 */

public class Example_008{

  public static void main(String[] args){

    /*
     * Array Objects are created and initialized
     * Array of primitives
     */
    int [] iArray = {1, 2, 3, 4, 5, 6, 7};
    double [] dArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};

    // Errors
    // int [] iArray2;
    // iArray2= {1, 2, 3, 4, 5, 6, 7};
    // double [] dArray2;
    // dArray2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};

    for(int i = 0; i < iArray.length; i++){

      System.out.println("iArray[ " + i + " ] = " + iArray[i]);
    }

    System.out.println();

    for(int i = 0; i < dArray.length; i++){

      System.out.println("dArray[ " + i + " ] = " + dArray[i]);
    }
  }
}