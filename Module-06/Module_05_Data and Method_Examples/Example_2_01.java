/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using reference variables
 */
public class Example_2_01{

  public static void main(String [] args){

    MyExampleClass_01 reference_01 = new MyExampleClass_01();
    MyExampleClass_02 reference_02 = new MyExampleClass_02();

    System.out.println();
    System.out.println("reference_01.value = " + reference_01.value);
    System.out.println("reference_02.value = " + reference_02.value);
    System.out.println();
  }
}

class MyExampleClass_01{

  int value = 9;

  public MyExampleClass_01(){

    System.out.println("MyExampleClass_01 - Value = " + value);
  }
}

class MyExampleClass_02{

  int value = 4;

  public MyExampleClass_02(){

    System.out.println("MyExampleClass_02 - Value = " + value);
  }
}