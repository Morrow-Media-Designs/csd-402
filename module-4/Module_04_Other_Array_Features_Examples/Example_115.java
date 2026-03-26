/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Copy and Sort Arrays
 *
 * Advanced Example
 */
import java.util.Arrays;

public class Example_115{

  public static void main(String[] args){

    int[] source = {99, 33, 11, 88, 44};
    int[] target = new int[5];

    for(int i = 0; i < source.length; i++){

      System.out.print("source[" + i + "] =" + source[i] + "\t");
      System.out.println("target[" + i + "] =" + target[i]); // All 0s
    }

    /*
     * Copies array contents
     * target = source; // this would only copy the array reference
     */
    System.arraycopy(source, 0, target, 0, source.length);

    System.out.println("\n\tAfter copy\n");

    for(int i = 0; i < source.length; i++){

      System.out.print("source[" + i + "] =" + source[i] + "\t");
      System.out.println("target[" + i + "] =" + target[i]); // All 0s
    }


    for(int i = 0; i < source.length; i++){

      // change source array valuse
      source[i] = (int)(Math.random() * 100 + 1);
    }

    System.out.println("\n\tAfter changes to original array\n");

    for(int i = 0; i < source.length; i++){

      System.out.print("source[" + i + "] =" + source[i] + "\t");
      // Copied array stayed the same
      System.out.println("target[" + i + "] =" + target[i]);
    }

    // Sort Arrays
    Arrays.sort(source);
    Arrays.sort(target);

    System.out.println("\n\tAfter sort\n");

    for(int i = 0; i < source.length; i++){

      System.out.print("source[" + i + "] =" + source[i] + "\t");
      System.out.println("target[" + i + "] =" + target[i]);
    }
  }
}