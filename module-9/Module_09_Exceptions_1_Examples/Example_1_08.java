/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Runtime Exception
 *
 * ArithmeticException
 * Exception is Handled by Catching Super Class
 */
public class Example_1_08{

  public static void main(String[] args){

    for(int i = 0; i < 5; i++){

      System.out.println("------------------------------------------");

      try{

        /*
         * Throws an exception is the second operand is 0
         */
        System.out.println(5 / (int)(Math.random() * 4));
      }

      /*
       * ArithmeticException "is-a" Exception
       */
      catch(Exception e){

        System.out.println("Exception has been thrown, caught, and handled.");
        System.out.println("You may not divide by 0.");
      }

      System.out.println("If an exception is thrown, this line executes because the exception has been handled.\n");

      System.out.println("------------------------------------------");
    }
  }
}