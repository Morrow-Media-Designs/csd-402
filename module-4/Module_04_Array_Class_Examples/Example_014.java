/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Arrays Class Methods
 *   equals()
 *   Check two arrays for equality
 */
import java.util.*;

public class Example_014{

  public static void main(String [] args){

    int [] array_01 = {2, 3, 4, 5};
    int [] array_02 = {2, 3, 4, 5};
    int [] array_03 = {2, 3, 4, 5, 6};

    int [] array_05 = {4, 5, 7, 2, 3, 6};
    int [] array_06 = {2, 3, 4, 5, 6, 7};

    System.out.println();

    System.out.println("  Array_01.equals(Array_02) is: " + Arrays.equals(array_01, array_02));
    System.out.println("  Array_02.equals(Array_01) is: " + Arrays.equals(array_02, array_01));

    System.out.println("  Array_02.equals(Array_03) is: " + Arrays.equals(array_02, array_03));
    System.out.println("  Array_03.equals(Array_02) is: " + Arrays.equals(array_03, array_02));

    System.out.println();

    System.out.println("  Array_05.equals(Array_06) is: " + Arrays.equals(array_05, array_06));

    Arrays.sort(array_05);
    Arrays.sort(array_06);

    System.out.println();

    System.out.println("  Array_05.equals(Array_06) is: " + Arrays.equals(array_05, array_06));
    System.out.println();
  }
}