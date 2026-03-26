/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_04{

  public static void main(String [] args){

    MyFirstClass4 myFirstClass_01 = new MyFirstClass4(6);
    MyFirstClass4 myFirstClass_02 = new MyFirstClass4(7);
  }
}

class MyFirstClass4{

  int value;

  MyFirstClass4(int param){

    System.out.println("MyFirstClass4 Constructor");
    value = param;
    System.out.println("value = " + value);
  }
}