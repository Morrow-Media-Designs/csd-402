/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * abs(x) Returns the absolute value - double|float|int|long
 * Returns the absolute (positive) value of a number.
 *
 * Errors
 * int = abs(long)
 * float = abs (double)
 */

public class Example_001{

  public static void main(String [] args){

    int i = -4;
    long j = -4;

    int ii;
    long jj;

    float f = -0.4F;
    double d = -0.6;

    float ff;
    double dd;

    // Valid
    ii = Math.abs(i);
    jj = Math.abs(j);
    ff = Math.abs(f);
    dd = Math.abs(d);

    jj = Math.abs(i);
    dd = Math.abs(f);

    // Errors    
    // ii = Math.abs(j);
    // ff = Math.abs(d);

    System.out.println(Math.abs(i));
    System.out.println(Math.abs(j));
    System.out.println(Math.abs(f)); 
    System.out.println(Math.abs(d)); 
  }
}