/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * void Return
 * More Output
 */
public class Example_109{

  public static void main(String [] args){

    Example_109.printrange(1, 2);
    System.out.println();
    Example_109.printrange(3, 6);
  }

  public static void printrange(int intParam_01, int intParam_02){

    for(int i = intParam_01; i <= intParam_02; ++i){

      System.out.println(i);
    }
  }
}