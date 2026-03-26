/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Methods with Arrays
 */
public class Example_104{

  public static void main(String [] args){

    int temp = 0;
    int index_01 = 0, index_02 = 0;

    int [][] intTable;

    intTable = Example_104.createArray(5, 5);

    Example_104.fillArray(intTable);

    System.out.println();

    Example_104.printArray(intTable);

    System.out.println();
    System.out.println();

    Example_104.shuffleArray(intTable);

    Example_104.printArray(intTable);

    System.out.println();
  }

  /*
   *
   */
  public static int [][] createArray(int rows, int columns){

    return new int[rows][columns];
  }

  /*
   *
   */
  public static void printArray(int [][] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      for(int j = 0; j < arrayParam[i].length; ++j){

        System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
      }

      System.out.println();
    }
  }

  /*
   *
   */
  public static void fillArray(int[][] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      for(int j = 0; j < arrayParam[i].length; ++j){

        arrayParam[i][j] = (int)(Math.random() * 90 + 10);
        //arrayParam[i][j] = i + j;
      }
    }
  }

  /*
   *
   */
  public static void shuffleArray(int[][] arrayParam){

    int temp = 0;
    int index_01 = 0, index_02 = 0;

    for(int i = 0; i < arrayParam.length; ++i){

      for(int j = 0; j < arrayParam[i].length; ++j){

        index_01 = (int)(Math.random() * arrayParam.length);
        index_02 = (int)(Math.random() * arrayParam[i].length);

        temp = arrayParam[i][j];
        arrayParam[i][j] = arrayParam[index_01][index_02];
        arrayParam[index_01][index_02] = temp;
      }
    }
  }
}