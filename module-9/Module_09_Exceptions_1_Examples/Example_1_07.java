/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception
 *
 * ArrayIndexOutOfBoundsException
 * Exception is Handled by Catching Super Class (Exception)
 */
public class Example_1_07{

  public static void main(String[] args){

    for(int i = 0; i <= args.length; i++){

      try{

        System.out.println(args[i]);
      }
      /*
       * ArrayIndexOutOfBoundsException is-a Exception
       */
      catch(Exception e){

        System.out.println("\n\nException has been thrown, caught, and handled.");
      }
    }

    System.out.println("\n\nThis line stills executes because exception has been handled\n\n");
  }
}