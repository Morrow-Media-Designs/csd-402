/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Override Methods
 */
public class Example_1_06{

  public static void main(String [] args){

    Animal_06 animal = new Animal_06();
    animal.speak();

    System.out.println();

    // Cat_06 is-a Animal_06
    Animal_06 a1 = new Cat_06();
    a1.speak();

    System.out.println();

    // Cat_06 is-a Animal_06
    Animal_06 a2 = new Dog_06();
    a2.speak();
  }
}

class Animal_06{

  public void speak(){

    System.out.println("Animals do not have a lot to say");
  }
}

class Cat_06 extends Animal_06{

  @Override
  public void speak(){

    System.out.println("I am a cat");
    System.out.println("Meow");
  }
}

class Dog_06 extends Animal_06{

  @Override
  public void speak(){

    System.out.println("I am a dog");
    System.out.println("Bark");
  }
}