/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Method Return - double
 */
public class Example_102{

  public static void main(String [] args){

    double localDouble = 2.2;

    System.out.println(localDouble);

    // Return not captured
    Example_102.getDoubleParam(localDouble);

    System.out.println(localDouble);

    // Assign return
    localDouble = Example_102.getDoubleParam(localDouble);

    System.out.println(localDouble);
  }

  public static double getDoubleParam(double param){

    return param * 2.0;
  }
}