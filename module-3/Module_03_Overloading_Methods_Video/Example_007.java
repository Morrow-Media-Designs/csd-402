/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * One Way to Correct
 */
public class Example_007{

  public static void main(String [] args){

    System.out.println(Example_007.largest(2, 3.423));
    System.out.println(Example_007.largest(2.454, 3));
    System.out.println(Example_007.largest(2.34353, 3.423));

    System.out.println(Example_007.largest(4, 3));
  }

  // One way to correct the problem
  public static double largest(int param_01, int param_02){

    return (param_01 > param_02 ? param_01 : param_02);
  }

  public static double largest(int param_01, double param_02){

    return (param_01 > param_02 ? param_01 : param_02);
  }

  public static double largest(double param_01, int param_02){

    return (param_01 > param_02 ? param_01 : param_02);
  }

  public static double largest(double param_01, double param_02){

    return (param_01 > param_02 ? param_01 : param_02);
  }
}