/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declare and Initialize
 */
public class Example_006{

  public static void main(String [] args){

    /*
     * Declare a two-dimensional array
     */
    int [][] intTable = null;  

    // Declare three array rows with five rows and three columns, and give initial values
    intTable = new int [][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {3, 3, 3}, {5, 5, 5} };

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}