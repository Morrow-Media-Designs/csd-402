/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Binary Search Manually
 * For a binary search the elements
 * Array must be in order
 *
 */
import java.util.*;

public class Example_011{

  public static void main(String [] args){

    int array2[] = Example_011.createArray(8);

    Example_011.fillMyArray(array2);

    Example_011.printArray(array2);

    Arrays.sort(array2);

    Example_011.printArray(array2);

    System.out.println("33 found at: " + binary(array2, 33));
    System.out.println("44 found at: " + binary(array2, 44));
    System.out.println("55 found at: " + binary(array2, 55));
    System.out.println("66 found at: " + binary(array2, 66));
    System.out.println("77 found at: " + binary(array2, 77));
  }

  public static int binary(int [] intArray, int key){

    int lowValue = 0;
    int highValue = intArray.length - 1;

    while (highValue >= lowValue){

      int midValue = (lowValue + highValue) / 2;

      if (key < intArray[midValue]){

        highValue = midValue - 1;
      }
      else if (key == intArray[midValue]){

        return midValue;
      }
      else{

        lowValue = midValue + 1;
      }
    }

    return -lowValue - 1;
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

      arrayParam[i] = (int)(Math.random() * 100);
    }
  }
}