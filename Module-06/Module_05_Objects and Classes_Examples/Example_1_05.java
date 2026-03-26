/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_05{

  public static void main(String [] args){

    MyFirstClass5 myFirstClass_01 = new MyFirstClass5(6);
    // Error
    //MyFirstClass5 myFirstClass_02 = new MyFirstClass5();
  }
}

class MyFirstClass5{

  int value;

  MyFirstClass5(int param){

    System.out.println("MyFirstClass5 Constructor");
    value = param;
    System.out.println("value = " + value);
  }
}