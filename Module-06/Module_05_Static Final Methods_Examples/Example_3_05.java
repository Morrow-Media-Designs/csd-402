/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * static and non static variables
 */
public class Example_3_05{

  public static void main(String args []){

    /*
     * Error
     */
    //MethodHolder_02.nonStaticSetValue(5);
    MethodHolder_02.staticSetValue(5);

    /*
     * Error
     */
    //MethodHolder_02.printData();
    MethodHolder_02.printData_02();

    System.out.println();

    MethodHolder_02 methodHolder = new MethodHolder_02();

    methodHolder.nonStaticSetValue(7);
    methodHolder.staticSetValue(7);
    methodHolder.printData();

    System.out.println();

    methodHolder.nonStaticSetValue(8);
    methodHolder.staticSetValue(8);
    methodHolder.printData();

    System.out.println();
    MethodHolder_02.printData_02();
  }
}

class MethodHolder_02{

  int value_01 = 0;
  static int value_02 = 0;

  public void nonStaticSetValue(int param){

    value_01 = param;
  }

  public static void staticSetValue(int param){

    value_02 = param;
  }

  public void printData(){

    System.out.println("value_01 = " + value_01);
    System.out.println("value_02 = " + value_02);
  }

  public static void printData_02(){

    System.out.println("value_02 = " + value_02);
  }
}