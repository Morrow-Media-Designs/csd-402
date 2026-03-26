/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Demonstrates the printStackTrace method of class Exception
 * Throws MyEighthException using the String parameter constructor
 * Extended Exception Class Calls the Super(String) Constructor
 */
public class Example_1_21{

  public static void main(String[] args){

    Example_1_21 example = new Example_1_21();

    try{

      example.aMethod1();
    }
    catch(MyEighthException mee){

      mee.printStackTrace();
    }
  }

  /*
   * Does not handle the exception thrown by aMethod2
   *  aMethod1 throws the exception thrown by aMethod2 back to
   *    the calling method
   */
  public void aMethod1() throws MyEighthException{

    aMethod2();
  }

  public void aMethod2() throws MyEighthException{

    /*
     * If our new Exception class had no default constructor
     *    the following statement would not compile
     *
     * throw new MyException();
     *
     */
    throw new MyEighthException("\n\n\tNote: *** aMethod2 Exception Thrown ***\n");
  }
}

class MyEighthException extends Exception{

/*
  public MyEighthException(){

    super();
  }
*/
  public MyEighthException(String s){

    super(s);
  }
}