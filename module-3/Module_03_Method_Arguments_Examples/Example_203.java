/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Invoke Using a Double Param
 */
public class Example_203{

  public static void main(String [] args){

    Example_203.printParam(0.0);
    System.out.println();
    Example_203.printParam(1.0);
    System.out.println();
    Example_203.printParam(2.0);
    System.out.println();
  }

  public static void printParam(double param){

    System.out.println("\t" + param);
  }
}