/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_08{

  public static void main(String [] args){

    MyFirstClass8 myFirstClass_01 = new MyFirstClass8(6);
    MyFirstClass8 myFirstClass_02 = new MyFirstClass8(7);
    MyFirstClass8 myFirstClass_03 = new MyFirstClass8(8);

    MyFirstClass8 myFirstClass_04 = new MyFirstClass8();
  }
}

class MyFirstClass8{

  int value;

  public MyFirstClass8(){

    System.out.println("MyFirstClass8 Constructor");
    value = 100;
    System.out.println("value = " + value);
  }

  public MyFirstClass8(int param){

    System.out.println("MyFirstClass8 Constructor");
    value = param;
    System.out.println("value = " + value);
  }
}