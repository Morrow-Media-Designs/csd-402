/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Swap Type Array?
 * Pass-by-value
 * Pass-by-reference
 */
public class Example_005{

  public static void main(String[] args){

    int intArray[] = {2, 4, 6, 8};

    System.out.printf("IntArray[0] = %d, IntArray[1] = %d.%n", intArray[0], intArray[1]);

    // Pass-by-value
    Example_005.swapInts(intArray);

    System.out.printf("IntArray[0] = %d, IntArray[1] = %d.%n", intArray[0], intArray[1]);
  }   

  public static void swapInts(int [] param_01){

    System.out.printf("%n");
    System.out.printf("Param_01[0] = %d, Param_02[1] = %d.%n", param_01[0], param_01[1]);

    int temp = param_01[0];
    param_01[0] = param_01[1];
    param_01[1] = temp;

    System.out.printf("Param_01[0] = %d, Param_02[1] = %d.%n", param_01[0], param_01[1]);
    System.out.printf("%n");
  }
}