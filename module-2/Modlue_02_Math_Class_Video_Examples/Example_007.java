/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * pow(x, y) Returns the value of x to the power of y
 * Return double
 */
public class Example_007{

  public static void main(String [] args){

    int i1 = 5;
    int i2 = 3;

    // Valid
    double d1 = Math.pow(i1, i2);
    double d2 = Math.pow(i1, 2);

    System.out.println(Math.pow(i1, i2)); // 125.0
    System.out.println(Math.pow(i1, 2)); // 25.0

    // Errors
    // int i3 = Math.pow(i1, i2);
    // int i4 = Math.pow(i1, 2);
    // long long_03 = Math.pow(i1, i2);
    // long long_04 = Math.pow(i1, 2);
    // float f1 = Math.pow(i1, i2);
    // float f2 = Math.pow(i1, 2);

  }
}