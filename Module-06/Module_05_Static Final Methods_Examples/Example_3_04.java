/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * static and non static methods
 */
public class Example_3_04{

  public static void main(String args []){

    /*
     * Error
     */
    //MethodHolder.nonStaticMethod();

    MethodHolder.staticMethod();

    MethodHolder methodHolder = new MethodHolder();

    methodHolder.nonStaticMethod();

    methodHolder.staticMethod();
  }
}

class MethodHolder{

  public void nonStaticMethod(){

    System.out.println("nonStaticMethod()");
  }

  public static void staticMethod(){

    System.out.println("staticMethod()");
  }
}