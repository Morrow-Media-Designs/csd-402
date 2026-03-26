/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception
 *
 * ArithmeticException
 * Exception is Handled
 */
public class Example_1_05{

  public static void main(String[] args){

    for(int i = 0; i < 5; i++){

      System.out.println("------------------------------------------");

      try{

        /*
         * Throws an exception if the second operand is 0
         */
        System.out.println(5 / (int)(Math.random() * 5));
      }

      /*
       * No code may be placed between a try block and a catch block
       * System.out.println(); // causes syntax error
       */

      catch(ArithmeticException ae){

        System.out.println("ArithmeticException has been thrown and handled.");
        System.out.println("You may not divide by 0.");
      }

      System.out.println("This line executes.");
      System.out.println("------------------------------------------");
    }
  }
}