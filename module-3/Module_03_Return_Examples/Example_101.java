/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Method Return - int
 */
public class Example_101{

  public static void main(String [] args){

    int localInt = 2;

    // Output is 2
    System.out.println(localInt);

    // Return not captured
    Example_101.getDoubleParam(localInt);

    // Output is 2, why?
    System.out.println(localInt);

    // Assign return
    localInt = Example_101.getDoubleParam(localInt);

    // What is the output?  Why?
    System.out.println(localInt);
  }

  public static int getDoubleParam(int param){

    return param * 2;
  }
}