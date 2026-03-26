/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Assign New Element Values
 */
public class Example_003{

  public static void main(String [] args){

    /*
     * Declare a two-dimensional array
     */
    int[][] intTable = null;  

    System.out.println();

    /*
     * 6 rows, 4 columns
     * Create arrays
     */
    intTable = new int[6][4];

    /*
     * 4 rows, 6 columns
     */
    // intTable = new int [4][6];

    /*
     * 5 rows, 5 columns
     */
    // intTable = new int [5][5];

    // Change array values
    // Rows
    for(int i = 0; i < intTable.length; ++i){
      // Columns
      for(int j = 0; j < intTable[i].length; ++j){

        intTable[i][j] = (int)(Math.random() * 90 + 10);
      }
    }

    // Print array values
    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}