/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Error? Why?
 *
 */
public class Example_206{

  public static void main(String [] args){

    byte b = 0;
    short s = 0;
    int i = 0;
    long lg = 0;

    Example_206.printParam(b);
    System.out.println();
    Example_206.printParam(s);
    System.out.println();
    Example_206.printParam(i);
    System.out.println();
    // Error
    Example_206.printParam(lg);
    System.out.println();
  }

  public static void printParam(int param){

    System.out.println("\t" + param);
  }
}