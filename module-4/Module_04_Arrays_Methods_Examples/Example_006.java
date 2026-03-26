/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Print part of an array
 *
 * This code is not what I would consider a good practice.
 */
public class Example_006{

  public static void main(String[] args){

    int array2[] = new int [8];

    fillMyArray(array2);

    Example_006.printPartOfArray(array2, array2.length);
    Example_006.printPartOfArray(array2, array2.length - 2);
    Example_006.printPartOfArray(array2, array2.length - 4);

    System.out.println();
  }

  public static void printPartOfArray(int [] arrayParam, int length){

    for(int i = 0; i < length; i++){

      System.out.print("[" + i + "] = " + arrayParam[i]);

      if(i < arrayParam.length - 1){

        System.out.print(", ");
      }
    }

    System.out.println("\n");
  }

  public static void fillMyArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      arrayParam[i] = (int)(Math.random() * 10);
    }
  }
}