/*
 *
 * Professor Darrell Payne
 * Example_993.java
 *
 * printf()
 * 
 * Precision specifiers
 * Integer, float, and double Formatting
 */
public class Example_103{

  public static void main(String [] args){

    int intVar = 12345;

    float f = 100.001F;
    double d = 100.001;

    // Width - Integers
    System.out.printf("intVar = %1d\n", intVar);
    System.out.printf("intVar = %2d\n", intVar);
    System.out.printf("intVar = %3d\n", intVar);
    System.out.printf("intVar = %4d\n", intVar);
    System.out.printf("intVar = %5d\n", intVar);
    System.out.printf("intVar = %6d\n", intVar);
    System.out.printf("intVar = %7d\n", intVar);
    System.out.printf("intVar = %8d\n", intVar);

    System.out.println();

    // Length of the decimal part - Fixed Floating - Floats
    System.out.printf("f = %.1f\n", f);
    System.out.printf("f = %.2f\n", f);
    System.out.printf("f = %.3f\n", f);
    System.out.printf("f = %.4f\n", f);
    System.out.printf("f = %.5f\n", f);
    System.out.printf("f = %.6f\n", f);
    System.out.printf("f = %.7f\n", f);

    System.out.println();

    // Length of the decimal part -  Fixed Floating - Doubles
    System.out.printf("d = %.1f\n", d);
    System.out.printf("d = %.2f\n", d);
    System.out.printf("d = %.3f\n", d);
    System.out.printf("d = %.4f\n", d);
    System.out.printf("d = %.5f\n", d);
    System.out.printf("d = %.6f\n", d);
    System.out.printf("d = %.7f\n", d);

    System.out.println();
  }
}