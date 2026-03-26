/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Syntax Errors
 *
 * Using [ , ] in place of [ ][ ]
 */
public class Example_010{

  public static void main(String [] args){

    int [][] intTable = new int [2][3];

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        intTable[i, j] = (int)(Math.random() * 90 + 10);
      }
    }

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + ", " + j + "] = " + intTable[i, j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}