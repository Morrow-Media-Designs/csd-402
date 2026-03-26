/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * aMethod1 Throws MyFourthException Which Must be Caught by the Invoking Method
 */
public class Example_1_14{

  public static void main(String[] args){

    Example_1_14 example = new Example_1_14();

    /*
     * syntax error, will not compile here if placed outside a try block
     * example.aMethod1();
     */

    /*
     * Place method call inside try/catch
     */
    try{

      example.aMethod1();
    }
    catch(MyFourthException mfe){

      System.out.println("MyFourthException");
    }
  }

  /*
   * This method throws a checked exception
   *   which must be caught by the invoking statement
   */
  public void aMethod1() throws MyFourthException{

    throw new MyFourthException();
  }
}

class MyFourthException extends Exception{

  public MyFourthException(){

    super();
  }

  public MyFourthException(String s){

    super(s);
  }
}