/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * ceil(x) Returns the value of x rounded up to its nearest integer
 * Return double
 */
public class Example_003{

  public static void main(String [] args){

    float f1 = 243.4F;
    float f2 = 243.5F;
    float f3 = 243.6F;

    double d1 = 723.4;
    double d2 = 723.5;
    double d3 = 723.6;

    System.out.println(Math.ceil(f1)); // 244.0
    System.out.println(Math.ceil(f2)); // 244.0
    System.out.println(Math.ceil(f3));  // 244.0

    System.out.println();

    System.out.println(Math.ceil(d1)); // 724.0
    System.out.println(Math.ceil(d2)); // 724.0
    System.out.println(Math.ceil(d3));  // 724.0


    // Error
    // f1 = Math.ceil(f1);
    // f1 = Math.ceil(d1);

    // Valid
    d1 = Math.ceil(f1);
    d1 = Math.ceil(d1);
  }
}