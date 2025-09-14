/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Final Values
 */
public class Example_007{

  public static void main(String [] args){

    // Final, Not Static
    final double PI = 3.14159;
    // Final, not static
    final int MAX_VALUE = 9999;

    // Error
    // PI = 4.44;

    // Error
    // MAX_VALUE = 99;

    System.out.println(PI * MAX_VALUE);
  }
}