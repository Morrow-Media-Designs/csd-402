/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * A Simple Method
 */
public class Example_001{

  public static void main(String [] args){

    Example_001.printParam(52);
    Example_001.printParam(53);
    Example_001.printParam(54.02);
    Example_001.printParam(55.02);

    System.out.println();

    // or
    for(int i = 52; i < 56; ++i){

      Example_001.printParam(i);
    }

    System.out.println();

    for(double i = 52.2; i < 56.2; ++i){

      Example_001.printParam(i);
    }
  }

  public static void printParam(double param_01){

    System.out.println(param_01);
  }
}