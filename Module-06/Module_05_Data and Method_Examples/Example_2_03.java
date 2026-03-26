/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_2_03{

  public static void main(String [] args){

    MyExampleClass_05 reference_05a = new MyExampleClass_05();
    MyExampleClass_05 reference_05b = new MyExampleClass_05("Test", 5, 33.44, true);

    System.out.println();
    System.out.println(reference_05a);
    System.out.println();

    System.out.println();
    System.out.println(reference_05b);
    System.out.println();
  }
}

class MyExampleClass_05{

  /*
   *  Class initial (default) values
   */
  private String myString;
  private int myInt;
  private double myDouble;
  private boolean myBoolean;

  public MyExampleClass_05(){}

  public MyExampleClass_05(String s, int i, double d, boolean b){

    myString = s;
    myInt = i;
    myDouble = d;
    myBoolean = b;
  }

  public String toString(){

    return "myString = " + myString + "\n" +
           "myInt = " + myInt + "\n" +
           "myDouble = " + myDouble + "\n" +
           "myBoolean = " + myBoolean;
  }
}