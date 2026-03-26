/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * Asymmetrical Arrays
 */
public class Example_101{

  public static void main(String [] args){

    /*
     * 4 rows, 4 - 1 columns
     */
    int [][] intTable = { 
                          {1, 2, 3, 4}, 
                          {5, 6, 7}, 
                          {9, 1}, 
                          {0}
                        };

    /*
     * 4 rows, 1 - 4 columns
     */
    int [][] intTable2 = { 
                          {1}, 
                          {5, 7}, 
                          {9, 1, 4}, 
                          {0, 6, 1, 2}
                        };

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();

    for(int i = 0; i < intTable2.length; ++i){

      for(int j = 0; j < intTable2[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable2[i][j] + " ");
      }

      System.out.println();
    }
  }
}