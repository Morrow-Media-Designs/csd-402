/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Finally is called if Exception is thrown
 * The one exception is System.exit(0);
 *
 * prints 1 2 4 5
 */
public class Example_1_16{

  public static void main(String[] args){

    Example_1_16 example = new Example_1_16();

    example.printNumbers();
  }

  public void printNumbers(){

    System.out.println(1); // Prints

    try{

      System.out.println(2); // Prints

      if(true){

        throw new MyTenthException();
      }

      /*
       * 3 will NOT be printed
       * when an exception is thrown
       */
      System.out.println(3); // Does NOT print
    }
    catch(MyTenthException mte){

      /*
       * 4 will always be printed
       * when an exception is thrown
       */
      System.out.println(4); // Prints
      //System.exit(0);
    }

    /*
     * 5 will ALWAYS be printed
     */
    finally{
      System.out.println(5); // Prints
    }
  }
}

class MyTenthException extends Exception{

  public MyTenthException(){

    super();
  }

  public MyTenthException(String s){

    super(s);
  }
}