/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Initialize Arrays
 */
public class Example_005{

  public static void main(String [] args){

    /*
     * Declare a two-dimensional array
     */
    int [][] intTable = null;  

    // Create array to hold arrays
    intTable = new int[3][];

    // Arrays with in initial values
    // Arrays held by an array
    intTable[0] = new int[] {1, 2, 3};
    intTable[1] = new int[] {4, 5, 6};
    intTable[2] = new int[] {7, 8, 9};

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}