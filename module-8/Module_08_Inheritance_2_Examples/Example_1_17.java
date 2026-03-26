/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Error
 * Cannot Override a Method in a Final Class
 */
public class Example_1_17{

  public static void main(String [] args){

  }
}

final class Animal_17{

  // This method is final
  public void printData(){

    System.out.println("Data");
  }
}

// Error - I cannot extend the Animal_17 class
class Cat_17 extends Animal_17{}