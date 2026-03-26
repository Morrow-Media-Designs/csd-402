/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Accessing an object's data
 */
public class Example_2_02{
  public static void main(String [] args){

    MyExampleClass_03 reference_03 = new MyExampleClass_03();
    MyExampleClass_04 reference_04 = new MyExampleClass_04();

    /*
     * Access errors
     */
    System.out.println();
    //System.out.println("reference_03.value = " + reference_03.value);
    //System.out.println("reference_04.value = " + reference_04.value);
    System.out.println();

    /*
     * Valid access on method
     */
    System.out.println();
    System.out.println("reference_03.getValue() = " + reference_03.getValue());
    System.out.println("reference_04.getValue() = " + reference_04.getValue());
    System.out.println();
  }
}

class MyExampleClass_03{

  private int value = 9;

  public MyExampleClass_03(){

    System.out.println("MyExampleClass_03 - Value = " + value);
  }

  public int getValue(){

    return value;
  }
}

class MyExampleClass_04{

  private int value = 4;

  public MyExampleClass_04(){

    System.out.println("MyExampleClass_04 - Value = " + value);
  }

  public int getValue(){

    return value;
  }
}