/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Return a Return
 * 
 * Will this work?
 */
public class Example_008{

  public static void main(String [] args){

    System.out.println(Example_008.largest(2, 3.423));
    System.out.println(Example_008.largest(2.454, 3));
    System.out.println(Example_008.largest(2.34353, 3.423));

    System.out.println(Example_008.largest(4, 3.423));
    System.out.println(Example_008.largest(4.454, 3));
    System.out.println(Example_008.largest(4.34353, 3.423));

    System.out.println(Example_008.largest(4, 3));
    System.out.println(Example_008.largest(2, 3));
  }

  public static double largest(int param_01, int param_02){

    return Example_008.largest((double)param_01, (double)param_02);
  }

  public static double largest(int param_01, double param_02){

    return Example_008.largest((double)param_01, param_02);
  }

  public static double largest(double param_01, int param_02){

    return Example_008.largest(param_01, (double)param_02);
  }

  public static double largest(double param_01, double param_02){

    return (param_01 > param_02 ? param_01 : param_02);
  }
}