/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scope - Block {} Scope
 */
public class Example_102{

  public static void main(String [] args){

    double firstDouble;

    {
      double secondDouble;
    }

    firstDouble = Math.pow(2, 3);
    secondDouble = Math.pow(3, 2);

    System.out.println("Math.pow(2, 3): " + firstDouble);
    System.out.println("Math.pow(3, 2): " + secondDouble);
  }
}