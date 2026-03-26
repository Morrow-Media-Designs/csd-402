/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * if(boolean variable)
 */
public class Example_101{

  public static void main(String [] args){

    int var_01 = 99;
    int var_02 = 99;
    int var_03 = 100;

    boolean result_01 = var_01 == var_02;
    boolean result_02 = var_02 == var_03;

    System.out.println();

    if(result_01){

      System.out.println("Equal \"1\"");
    }

    System.out.println();

    if(result_02){

      System.out.println("Equal \"2\"");
    }

    System.out.println();
  }
}