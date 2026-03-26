/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Array of Arrays
 */
public class Example_004{

  public static void main(String [] args){

    /*
     * Declare array reference
     */
    int [][] intTable = null;  

    // Create array to hold arrays
    intTable = new int[3][];

    // Create second dimension of arrays
    // Arrays held by an array
    intTable[0] = new int [3];
    intTable[1] = new int [3];
    intTable[2] = new int [3];

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}