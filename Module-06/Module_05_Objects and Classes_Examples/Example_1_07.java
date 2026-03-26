/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_07{

  public static void main(String [] args){

    // Errors - Why?
    MyFirstClass7 myFirstClass_01 = new MyFirstClass7(6);
    MyFirstClass7 myFirstClass_02 = new MyFirstClass7(7);
    MyFirstClass7 myFirstClass_03 = new MyFirstClass7(8);

    // Error?
    MyFirstClass7 myFirstClass_04 = new MyFirstClass7();
  }
}

class MyFirstClass7{

  int value;

  void MyFirstClass7(){

    System.out.println("MyFirstClass7 Constructor");
    value = 100;
    System.out.println("value = " + value);
  }

  void MyFirstClass7(int param){

    System.out.println("MyFirstClass7 Constructor");
    value = param;
    System.out.println("value = " + value);
  }
}