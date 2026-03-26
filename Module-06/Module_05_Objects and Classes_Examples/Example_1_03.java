/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_03{

  public static void main(String [] args){

    MyFirstClass3 myFirstClass = new MyFirstClass3();
  }
}

class MyFirstClass3{

  int value;

  MyFirstClass3(){

    System.out.println("MyFirstClass3 Constructor");
    value = 100;
    System.out.println("value = " + value);
  }
}