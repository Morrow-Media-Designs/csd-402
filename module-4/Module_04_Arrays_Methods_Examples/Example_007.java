/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Create Array Method
 */
public class Example_007{

  public static void main(String[] args){

    int array2[] = Example_007.createArray(8);

    Example_007.printArray(array2);

    Example_007.fillMyArray(array2);

    Example_007.printArray(array2);

    array2 = createArray(3);

    Example_007.printArray(array2);

    Example_007.fillMyArray(array2);

    Example_007.printArray(array2);

    array2 = createArray(5);

    Example_007.printArray(array2);

    Example_007.fillMyArray(array2);

    Example_007.printArray(array2);
  }

  public static int [] createArray(int size){

    return new int [size];
  }

  public static void printArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; i++){

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