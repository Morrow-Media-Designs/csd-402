/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Naming Conventions
 */
public class Example_008{

  public static void main(String [] args){

    // Valid
    int maxValue = 2147483647;
    int maxValue2 = -2147483648;

    // Not a valid value
    // int maxValueE = 2147483648;

    // Valid
    short s1 = 32767;

    // Not a valid value
    // short s1 = 32768;

    System.out.println(maxValue);
    System.out.println(maxValue2);

    // These will not have the outcome expected
    maxValue = maxValue + 1;
    maxValue2 = maxValue2 - 1;

    System.out.println();

    System.out.println(maxValue);
    System.out.println(maxValue2);
  }
}