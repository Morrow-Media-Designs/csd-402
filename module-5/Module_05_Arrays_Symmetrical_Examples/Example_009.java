/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Can we do this?
 */
public class Example_009{

  public static void main(String [] args){

    int [][] intTable = new int [(int)(Math.random() * 4 + 1)][(int)(Math.random() * 4 + 1)];

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        intTable[i][j] = (int)(Math.random() * 90 + 10);
      }
    }


    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }
}