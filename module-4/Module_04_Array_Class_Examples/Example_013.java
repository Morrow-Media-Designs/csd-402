/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Arrays Class 
 *   binarySearch() and sort()
 */
import java.util.Arrays;

public class Example_013{

  public static void main(String [] args){

    int [] values = Example_013.createArray(8);

    Example_013.fillMyArray(values);

    Example_013.printArray(values);

    Arrays.sort(values);
    // Arrays.parallelSort(values);

    Example_013.printArray(values);

    // 1,  3,  3,  5,  6,  7,  8,  8
    // The value of 2 is at: -2
    // The value of 4 is at: -4

    System.out.println("The value of 8 is at: " + Arrays.binarySearch(values, 8));
    System.out.println("The value of 2 is at: " + Arrays.binarySearch(values, 2));
    System.out.println("The value of 4 is at: " + Arrays.binarySearch(values, 4));
  }

  public static int [] createArray(int size){

    return new int [size];
  }

  public static void printArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; i++){

      System.out.print(" " + arrayParam[i]);

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