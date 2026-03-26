/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Finally (clause) is called if no Exception is thrown
 * The one exception is System.exit(0);
 *
 * prints 1 2 3 5
 *
 * No code may be place:
 *
 * between a try/catch
 * between a try/finally
 * between a catch/finally
 *
 */
public class Example_1_15{

  public static void main(String[] args){

    Example_1_15 example = new Example_1_15();

    example.printNumbers();
  }

  public void printNumbers(){

    /*
     * 1 will always be printed
     */
    System.out.println(1);

    try{

      /*
       * 2 will always be printed
       */
      System.out.println(2);

      if(false){

        /*
         * Does not execute
         */
        throw new MyNinthException();
      }

      /*
       * 3 will be printed in this code
       * because the exception is not thrown
       */
      System.out.println(3);
    }
    catch(MyNinthException mne){

      /*
       * 4 will NOT be printed in this code
       * because the exception is not thrown
       */
      System.out.println(4); 
    }
    finally{

      /*
       * 5 will ALWAYS be printed
       */
      System.out.println(5);
    }
  }
}

class MyNinthException extends Exception{

  public MyNinthException(){

    super();
  }

  public MyNinthException(String s){

    super(s);
  }
}