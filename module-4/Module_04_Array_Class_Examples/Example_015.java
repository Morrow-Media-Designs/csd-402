/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Arrays Class
 *   fill()
 *   ls in all or part of an array
 */
import java.util.*;

public class Example_015{

  public static void main(String [] args){

    int [] array1 = {2, 3, 4, 5, 3, 4, 5, 6};
    
    Example_015.printArray(array1);

    Arrays.fill(array1, 4); // Fills whole array with 4s

    Example_015.printArray(array1);

    Arrays.fill(array1, 0, 3, 9); // Files from 0 to 2 with 9s, part of the array

    Example_015.printArray(array1);
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

}