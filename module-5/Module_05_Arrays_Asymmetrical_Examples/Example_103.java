/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Shuffling Elements in Multiple Dimension Arrays
 */
public class Example_103{

  public static void main(String [] args){

    int temp = 0;
    int index_01 = 0, index_02 = 0;

    int [][] intTable = new int [5][5];

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        intTable[i][j] = i + j;
      }
    }

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }


    // Shuffling
    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        index_01 = (int)(Math.random() * intTable.length);
        index_02 = (int)(Math.random() * intTable[i].length);

        temp = intTable[i][j];
        intTable[i][j] = intTable[index_01][index_02];
        intTable[index_01][index_02] = temp;
      }
    }

    System.out.println();

    for(int i = 0; i < intTable.length; ++i){

      for(int j = 0; j < intTable[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + intTable[i][j] + " ");
      }

      System.out.println();
    }
  }
}