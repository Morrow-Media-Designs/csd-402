/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * cbrt(x)	Returns the cube root
 * Return type double
 */
public class Example_002{

  public static void main(String [] args){

    int i = -125;
    long j = -27;

    int ii;
    long jj;

    float f = -243.4F;
    double d = -723.6;

    float ff;
    double dd;

    // Valid
    dd = Math.cbrt(i);
    dd = Math.cbrt(j);
    dd = Math.cbrt(f);
    dd = Math.cbrt(d);

    // Error
    // ii = Math.cbrt(i);
    // jj = Math.cbrt(j);
    // ff = Math.cbrt(f);

    System.out.println(Math.cbrt(i)); // -5.0
    System.out.println(Math.cbrt(j)); // -3.0
    System.out.println(Math.cbrt(f)); // -6.243673546234634
    System.out.println(Math.cbrt(d)); // -8.977722681170949
  }
}