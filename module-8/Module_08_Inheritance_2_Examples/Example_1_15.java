/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Cannot Override a Non-Static Method with a Static Method
 */
public class Example_1_15{

  public static void main(String [] args){

    Cat_13a c1 = new Cat_13a();

    c1.printData();
  }
}

class Animal_13a{

  public void printData(){

    System.out.println("Animal Data");
  }
}

class Cat_13a extends Animal_13a{

  // Error
  // Cannot override a non-static method
  //    with a static method
  // @Override
  // public static void printData(){

    // Error
    // super.printData();

    // System.out.println("Cat Data");
  //}
}