/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scope - Method Scope
 */
public class Example_103{

  public static void main(String [] args){

    double firstDouble;
    double secondDouble;

    firstDouble = Math.pow(2, 3);
    secondDouble = Math.pow(3, 2);

    System.out.println("Math.pow(2, 3): " + thirdDouble);
    System.out.println("Math.pow(3, 2): " + fourthDouble);
  }

  public static void printDoubles(){

    double thirdDouble;
    double fourthDouble;

    thirdDouble = Math.pow(2, 3);
    fourthDouble = Math.pow(3, 2);

    System.out.println("Math.pow(2, 3): " + firstDouble);
    System.out.println("Math.pow(3, 2): " + secondDouble);

  }
}