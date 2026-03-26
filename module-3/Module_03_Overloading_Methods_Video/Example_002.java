/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Overload a Method
 */
public class Example_002{

  public static void main(String [] args){

    Example_002.printParam(52);
    Example_002.printParam(52.00);
    Example_002.printParam(98);
    Example_002.printParam(98.00);

  }

  public static void printParam(int param_01){

    System.out.println("int value = " + param_01);
  }

  public static void printParam(double param_01){

    System.out.println("double value = " + param_01);
  }

  // Why is this never invoked?
  public static void printParam(float param_01){

    System.out.println("float value = " + param_01);
  }
}