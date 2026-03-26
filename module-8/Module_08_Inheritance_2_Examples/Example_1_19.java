/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Non-Polymorphic Behavior - Using Static Methods
 */
public class Example_1_19{

  public static void main(String[] args){

    Animal_19 animals[] = new Animal_19[4];

    animals[0] = new Animal_19();
    animals[1] = new Cat_19();
    animals[2] = new Dog_19();
    animals[3] = new Snake_19();

    for(int i = 0; i < animals.length; i++){

      /*
       * Invokes static method belonging to the reference
       */
      animals[i].speak();
    }

    System.out.println();

    Cat_19.speak(); // Best
    Cat_19 c2 = new Cat_19();
    c2.speak();
    System.out.println();
    Dog_19.speak(); // Best
    Dog_19 d2 = new Dog_19();
    d2.speak();
    System.out.println();
    Snake_19.speak(); // Best
    Snake_19 s2 = new Snake_19();
    s2.speak();

    System.out.println();
  }
}

class Animal_19{

  public static void speak(){

    System.out.println("I am an Animal");
  }
}

class Cat_19 extends Animal_19{

  // @Override
  // We cannot override static methods
  public static void speak(){

    System.out.println("Meow");
  }
}

class Dog_19 extends Animal_19{

  public static void speak(){

    System.out.println("Bark");
  }
}

class Snake_19 extends Animal_19{

  public static void speak(){

    System.out.println("Hiss");
  }
}