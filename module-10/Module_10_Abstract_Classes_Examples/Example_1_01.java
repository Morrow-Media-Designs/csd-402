/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Abstract Method
 */
public class Example_1_01{

  public static void main(String [] args){

    // Error
    // Animal_21 a1 = new Animal_21();

    Cat_21 cat = new Cat_21();
    cat.speak();
  }
}

abstract class Animal_21{

  public abstract void speak();
}

class Cat_21 extends Animal_21{

  @Override
  public void speak(){

    System.out.println("I am a cat");
    System.out.println("Meow");
  }
}