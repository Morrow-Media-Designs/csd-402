/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Iterate through the array(s)
 *
 * Array of Arrays
 *
 */
public class Example_002{

  public static void main(String [] args){

    /*
     * Declare a two-dimensional array
     */
    int[][] intTable = null;  

    /*
     * 4 rows, 3 columns
     * Creates arrays
     */
    intTable = new int [4][3];

    System.out.println();

    /*
     * Outputs the toString value on the intTable array
     */
    System.out.println("intTable " + intTable);

    System.out.println();

    for(int i = 0; i < intTable.length; ++i){

      /*
       * Outputs the toString value on each intTable[#] array
       */
      System.out.println("intTable[" + i + "] " + intTable[i]);
    }

    System.out.println();

    /* 
     * Columns       [0]   [1]    [2] (total 3 columns)
     *
     *  Row [0]    [0][0] [0][1] [0][2] Rows
     *  Row [1]    [1][0] [1][1] [1][2] Rows
     *  Row [2]    [2][0] [2][1] [2][2] Rows
     *  Row [3]    [3][0] [3][1] [3][2] Rows
     * (total 4 rows)
     */
    // Rows
    for(int i = 0; i < intTable.length; ++i){
      // Columns
      for(int j = 0; j < intTable[i].length; ++j){

        /*
         * Outputs the default array values
         */
        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}