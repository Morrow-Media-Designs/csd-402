/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Demonstrates the printStackTrace method of class Exception
 */
public class Example_1_20{

  public static void main(String[] args){

    Example_1_20 example = new Example_1_20();

    try{

      example.aMethod1();
    }
    catch(MySeventhException mse){

      mse.printStackTrace();
    }
  }

  /*
   * Does not handle the exception thrown by aMethod2
   *  aMethod1 throws the exception thrown by aMethod2 back to
   *    the calling method
   */
  public void aMethod1() throws MySeventhException{

    aMethod2();
  }

  public void aMethod2() throws MySeventhException{

    throw new MySeventhException();
  }
}

class MySeventhException extends Exception{

  public MySeventhException(){

    super();
  }

  public MySeventhException(String s){

    super(s);
  }
}