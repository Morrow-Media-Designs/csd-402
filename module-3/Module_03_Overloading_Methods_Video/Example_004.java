/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Returns
 */
public class Example_004{

  public static void main(String [] args){

    int holdReturnInt = 0;
    double holdReturnDouble = 0.0;

    // Return is ignored
    Example_004.getAverage(2, 3);
    Example_004.getAverage(3.4, 5.6);

    // Return printed
    System.out.println(Example_004.getAverage(2, 3));
    System.out.println(Example_004.getAverage(3.4, 5.6));

    // Return assigned
    holdReturnInt = Example_004.getAverage(2, 3);
    holdReturnDouble = Example_004.getAverage(3.4, 5.6);

    // Will this work? Implicit Conversion, Implicit Cast
    holdReturnDouble = Example_004.getAverage(2, 3);

    // Error
    // holdReturnInt = Example_004.getAverage(3.4, 5.6);

    // Explicit cast of the return type
    holdReturnInt = (int) Example_004.getAverage(3.4, 5.6);
  }

  public static int getAverage(int param_01, int param_02){

    return (param_01 + param_02) / 2;
  }

  public static double getAverage(double param_01, double param_02){

    return (param_01 + param_02) / 2;
  }
}