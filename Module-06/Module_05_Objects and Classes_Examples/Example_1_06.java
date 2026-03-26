/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_06{

  public static void main(String [] args){

    MyFirstClass6 myFirstClass_01 = new MyFirstClass6(6);
    MyFirstClass6 myFirstClass_02 = new MyFirstClass6(7);
    MyFirstClass6 myFirstClass_03 = new MyFirstClass6(8);

    MyFirstClass6 myFirstClass_04 = new MyFirstClass6();
  }
}

class MyFirstClass6{

  int value;

  MyFirstClass6(){

    System.out.println("MyFirstClass6 Constructor");
    value = 100;
    System.out.println("value = " + value);
  }

  MyFirstClass6(int param){

    System.out.println("MyFirstClass6 Constructor");
    value = param;
    System.out.println("value = " + value);
  }
}