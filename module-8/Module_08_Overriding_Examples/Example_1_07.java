/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Override Methods
 * and
 * Overload Methods
 */
public class Example_1_07{

  public static void main(String [] args){

    Animal_07 animal = new Animal_07();
    // Error
    // animal.speak(0);

    System.out.println();

    // Cat_07 is-a Animal_07
    Animal_07 cat = new Cat_07();
    // Error
    // cat.speak(0);

    System.out.println();

    // Cat_07 is-a Animal_07
    Animal_07 dog = new Dog_07();
    // Error
    // dog.speak(0);

    System.out.println("---------------------------");

    Cat_07 c3 = new Cat_07();
    c3.speak();
    c3.speak(0);

    Dog_07 d3 = new Dog_07();
    d3.speak();
    d3.speak(0);
  }
}

class Animal_07{

  public void speak(){

    System.out.println("Animals do not have a lot to say");
  }
}

class Cat_07 extends Animal_07{

  @Override
  public void speak(){

    System.out.println("I am a cat");
    System.out.println("Meow");
  }

  public void speak(int param){

    System.out.println("I am a cat");
    System.out.println("Meow");
  }
}

class Dog_07 extends Animal_07{

  @Override
  public void speak(){

    System.out.println("I am a dog");
    System.out.println("Bark");
  }

  public void speak(int param){

    System.out.println("I am a dog");
    System.out.println("Bark");
  }
}