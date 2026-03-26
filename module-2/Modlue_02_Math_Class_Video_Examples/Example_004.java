/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * floor(x) Returns the value of x rounded down to its nearest integer
 * Return double
 */
public class Example_004{

  public static void main(String [] args){

    float f1 = 243.4F;
    float f2 = 243.5F;
    float f3 = 243.6F;

    double d1 = 723.4;
    double d2 = 723.5;
    double d3 = 723.6;

    System.out.println(Math.floor(f1)); // 243.0
    System.out.println(Math.floor(f2)); // 243.0
    System.out.println(Math.floor(f3));  // 243.0

    System.out.println();

    System.out.println(Math.floor(d1)); // 723.0
    System.out.println(Math.floor(d2)); // 723.0
    System.out.println(Math.floor(d3));  // 723.0

    // Error
    // f1 = Math.floor(f1);
    // f1 = Math.floor(d1);

    // Valid
    d1 = Math.floor(f1);
    d1 = Math.floor(d1);
  }
}