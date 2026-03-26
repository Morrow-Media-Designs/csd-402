/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Creating Arrays
 *
 * When declaring an array you may use one of the following
 */
public class Example_004{

  public static void main(String [] args){

    final int ARRAY_SIZE = 6;
    int arraySize = 7;

    int [] array1 = new int[5]; // 5
    int [] array2 = new int[ARRAY_SIZE];  // 6
    int [] array3 = new int[arraySize]; // 7
    int [] array4 = new int[ARRAY_SIZE + arraySize]; // 13
 
    System.out.println(array1.length); // 5
    System.out.println(array2.length); // 6
    System.out.println(array3.length); // 7
    System.out.println(array4.length); // 13

    // With arrays, length is not a method.
    // System.out.println(array1.length()); // 5
    // System.out.println(array2.length()); // 6
    // System.out.println(array3.length()); // 7
    // System.out.println(array4.length()); // 13
  }
}