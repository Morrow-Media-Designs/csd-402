/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * super.baseClassMethod()
 */
public class Example_1_08{

  public static void main(String [] args){

    Animal_08 animal = new Animal_08();
    animal.speak();

    System.out.println();
    System.out.println();

    // Cat_08 is-a Animal_08
    Animal_08 cat = new Cat_08();
    cat.speak();

    System.out.println();
    System.out.println();

    // Cat_08 is-a Animal_08
    Animal_08 dog = new Dog_08();
    dog.speak();
  }
}

class Animal_08{

  public void speak(){

    System.out.print("I am an animal and ");
  }
}

class Cat_08 extends Animal_08{

  @Override
  public void speak(){

    super.speak();

    System.out.println("I am a cat");
    System.out.println("Meow");
  }
}

class Dog_08 extends Animal_08{

  @Override
  public void speak(){

    super.speak();

    System.out.println("I am a dog");
    System.out.println("Bark");
  }
}