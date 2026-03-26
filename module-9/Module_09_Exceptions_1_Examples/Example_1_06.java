/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * NullPointerException
 * Exception is Handled
 */
public class Example_1_06{

  /*
   * init value is null
   */
  public Data data;

  public static void main(String[] args){

    Example_1_06 example = new Example_1_06();

    try{

      example.data.aMethod();
    }
    catch(NullPointerException npe){

      System.out.println("NullPointerException has been thrown, caught, and handled.");
      System.out.println("Try creating an instance and calling the method again.\n");
    }

    /*
     * Create object
     */
    example.data = new Data();

    try{

      example.data.aMethod();
    }
    catch(NullPointerException npe){

      System.out.println("NullPointerException has been thrown, caught, and handled.");
      System.out.println("Try creating an instance and calling the method again.\n");
    }
  }
}

class Data extends Object{

  public void aMethod(){

    System.out.println("Data.aMethod()");
  }
}