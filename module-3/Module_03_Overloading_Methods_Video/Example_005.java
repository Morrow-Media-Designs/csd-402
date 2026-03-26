/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Which Method
 */
public class Example_005{

  public static void main(String [] args){

    // Valid - Which Method
    Example_005.printAverage(31, 62);
    Example_005.printAverage(21.0, 82.0);

    // Valid - Which Method
    Example_005.printAverage(31.54, 62);
    Example_005.printAverage(21, 82.32);
  }

  public static void printAverage(int param_01, int param_02){

    System.out.println((param_01 + param_02) / 2);
  }

  public static void printAverage(double param_01, double param_02){

    System.out.println((param_01 + param_02) / 2.0);
  }
}