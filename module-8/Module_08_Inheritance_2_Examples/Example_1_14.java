/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Cannot Override a Static Method
 */
public class Example_1_14{

  public static void main(String [] args){

    Animal_14 a1 = new Animal_14();

    // Valid
    a1.printData();
    // Best
    Animal_14.printData();

    Cat_14 c1 = new Cat_14();

    System.out.println();
    System.out.println();

    // Valid
    c1.printData();
    // Best
    Cat_14.printData();
  }
}

class Animal_14{

  public static void printData(){

    System.out.println("Animal Data");
  }
}

class Cat_14 extends Animal_14{

  // Error - Cannot override a static method
  // public void printData(){}

  // I did not override the base class method here
  // This is a new static method
  // @Override // - Error
  public static void printData(){

    // Error - Because this method did not override the base class method
    // super.printData();

    // However I can do this because it is a static method
    Animal_14.printData();

    System.out.println("Cat Data");
  }
}