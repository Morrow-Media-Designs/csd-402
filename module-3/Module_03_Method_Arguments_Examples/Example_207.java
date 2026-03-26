/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Will this work? Why?
 */
public class Example_207{

  public static void main(String [] args){

    byte b = 2;
    short s = 3;
    int i = 4;
    long lg = 5;

    Example_207.printParam(b);
    System.out.println();
    Example_207.printParam(s);
    System.out.println();
    Example_207.printParam(i);
    System.out.println();
    Example_207.printParam(lg);
    System.out.println();
  }

  public static void printParam(double param){

    System.out.println("\t" + param);
  }
}