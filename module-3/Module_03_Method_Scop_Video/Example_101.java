/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scope - Declare Before Using
 */
public class Example_101{

  public static void main(String [] args){

    double firstDouble;

    firstDouble = Math.pow(2, 3);
    secondDouble = Math.pow(3, 2);

    double secondDouble;

    System.out.println("Math.pow(2, 3): " + firstDouble);
    System.out.println("Math.pow(3, 2): " + secondDouble);
  }
}