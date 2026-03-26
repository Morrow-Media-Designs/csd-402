/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Correcting the Error
 */
public class Example_205{

  public static void main(String [] args){

    Example_205.printParam(0.0F);
    System.out.println();
    Example_205.printParam(1.0F);
    System.out.println();
    Example_205.printParam((float)2.0);
    System.out.println();
  }

  public static void printParam(float param){

    System.out.println("\t" + param);
  }
}