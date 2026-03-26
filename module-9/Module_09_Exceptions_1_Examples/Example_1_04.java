/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception
 *
 * ArrayIndexOutOfBoundsException
 *
 * Exception is Handled
 */
public class Example_1_04{

  public static void main(String[] args){

    for(int i = 0; i <= args.length; i++){

      try{

        System.out.println(args[i]);
      }
      /*
       * No code may be placed between a try block and a catch block
       * System.out.println(); // is a syntax error
       */
      catch(ArrayIndexOutOfBoundsException aioobe){

        System.out.println("\n\nArrayIndexOutOfBoundsException has been thrown, caught, and handled.");
      }
    }

    System.out.println("\n\nThis line stills executes because exception has been handled.\n");
  }
}