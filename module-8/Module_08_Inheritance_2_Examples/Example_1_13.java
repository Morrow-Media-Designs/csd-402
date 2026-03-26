/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * this.method()
 * and
 * super.method()
 */
public class Example_1_13{

  public static void main(String [] args){

    Cat_13 cat = new Cat_13();
    cat.talk();

    System.out.println();

    Dog_13 dog = new Dog_13();
    dog.talk();
  }
}

class Animal_13{

  public void speak(){

    System.out.println("I am an animal");
  }
}

class Cat_13 extends Animal_13{

  @Override
  public void speak(){

    System.out.println("I am a cat");
    System.out.println("Meow");
  }

  public void talk(){

    super.speak();
    this.speak();
  }
}

class Dog_13 extends Animal_13{

  @Override
  public void speak(){

    System.out.println("I am a dog");
    System.out.println("Bark");
  }

  public void talk(){

    this.speak();
    super.speak();
  }
}