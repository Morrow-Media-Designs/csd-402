/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * super.baseClassMethod()
 */
public class Example_1_09{

  public static void main(String [] args){

    Animal_08a animal = new Animal_08a();
    animal.speak();

    System.out.println();
    System.out.println();

    // Cat_08a is-a Animal_08a
    Animal_08a cat = new Cat_08a();
    cat.speak();

    System.out.println();
    System.out.println();

    // Cat_08a is-a Animal_08a
    Animal_08a dog = new Dog_08a();
    dog.speak();
  }
}

class Animal_08a{

  public void speak(){

    System.out.println("I am an animal.");
  }
}

class Cat_08a extends Animal_08a{

  @Override
  public void speak(){

    System.out.print("I am a cat and ");

    super.speak();

    System.out.println("Meow");
  }
}

class Dog_08a extends Animal_08a{

  @Override
  public void speak(){

    System.out.print("I am a dog and ");

    super.speak();

    System.out.println("Bark");
  }
}