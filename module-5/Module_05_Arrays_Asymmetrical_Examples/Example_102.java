/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Iterate Through Asymmetrical Arrays
 */
public class Example_102{

  public static void main(String [] args){

    int [][] intTable = new int [4][];
    int [][] intTable2 = new int [4][];

    for(int i = 0; i < intTable.length; ++i){

      intTable[i] = new int [i + 1];
    }

    for(int i = 0; i < intTable2.length; ++i){

      intTable2[i] = new int [intTable2.length - i];
    }

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        intTable[i][j] = (int)(Math.random() * 6 + 1);
      }
    }

    for(int i = 0; i < intTable2.length; ++i){

      for(int j = 0; j < intTable2[i].length; ++j){

        intTable2[i][j] = (int)(Math.random() * 6 + 1);
      }
    }

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