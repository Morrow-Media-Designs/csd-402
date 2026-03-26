/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception
 *
 * ArithmeticException
 * ArithmeticException is handled
 * Multiple Catches for a Single Try
 * Only one catch is executed for each exception thrown
 */
public class Example_1_09{

  public static void main(String[] args){

    for(int i = 0; i < 5; i++){

      System.out.println("------------------------------------------");

      try{

        /*
         * Throws an exception is the second operand is 0
         */
        System.out.println(5 / (int)(Math.random() * 2));
      }

      /*
       * ArithmeticException is-a Exception
       */
      catch(ArithmeticException ae){

        System.out.println("ArithmeticException has been throwncaught, and handled.");
        System.out.println("You may not divide by 0.");
      }
      catch(Exception e){

        System.out.println("Exception has been throwncaught, and handled.");
        System.out.println("Exception has been thrown, caught, and handled.");
      }

      System.out.println("------------------------------------------");
    }
  }
}