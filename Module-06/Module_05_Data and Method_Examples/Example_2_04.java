/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Assign initial values
 */
public class Example_2_04{

  public static void main(String [] args){

    MyExampleClass_06 reference_06a = new MyExampleClass_06();
    MyExampleClass_06 reference_06b = new MyExampleClass_06("Test", 5, 33.44, true);

    System.out.println();
    System.out.println(reference_06a);
    System.out.println();

    System.out.println();
    System.out.println(reference_06b);
    System.out.println();
  }
}

class MyExampleClass_06{

  private String myString = new String("The Wall");
  private int myInt = 8;
  private double myDouble = 9.241;
  private boolean myBoolean = true;

  public MyExampleClass_06(){}

  public MyExampleClass_06(String s, int i, double d, boolean b){

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