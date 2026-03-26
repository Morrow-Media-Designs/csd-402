/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Swap Type Array?
 * Pass-by-value
 * Pass-by-reference
 */
public class Example_004{

  public static void main(String[] args){

    int var_01 = 9, var_02 = 4;

    System.out.printf("Var_01 = %d, Var_02 = %d.%n", var_01, var_02);

    // Pass-by-value
    Example_004.swapInts(var_01, var_02);

    System.out.printf("Var_01 = %d, Var_02 = %d.%n", var_01, var_02);
  }   

  public static void swapInts(int param_01, int param_02){

    System.out.printf("%n");
    System.out.printf("Param_01 = %d, Param_02 = %d.%n", param_01, param_02);

    int temp = param_01;
    param_01 = param_02;
    param_02 = temp;

    System.out.printf("Param_01 = %d, Param_02 = %d.%n", param_01, param_02);
    System.out.printf("%n");
  }
}