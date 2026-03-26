/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Linear Search
 *
 * Sequentially Search Array
 * Return subscript of first found
 * Return -1 if not found
 *
 */
public class Example_010{

  public static void main(String [] args){

    int [] intArray = Example_010.createArray(20);

    Example_010.fillMyArray(intArray);
     
    Example_010.printArray(intArray);

    System.out.println("1 was at " + Example_010.searchFor(intArray, 1));
    System.out.println("2 was at " + Example_010.searchFor(intArray, 2));
    System.out.println("3 was at " + Example_010.searchFor(intArray, 3));
    System.out.println("4 was at " + Example_010.searchFor(intArray, 4));
  }

  public static int searchFor(int [] param, int lookFor){

    for(int i = 0; i < param.length; ++i){

       if(param[i] == lookFor){

         return i;
       }
    }
    return -1;
  }

  public static int [] createArray(int size){

    return new int [size];
  }

  public static void printArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; i++){

      System.out.print(arrayParam[i] + " ");

    }

    System.out.println("\n");
  }

  public static void fillMyArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

        arrayParam[i] = (int)(Math.random() * 10 + 1);
    }
  }
}