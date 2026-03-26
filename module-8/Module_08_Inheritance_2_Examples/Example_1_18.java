/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Polymorphism
 *
 */
public class Example_1_18{

  public static void main(String[] args){

    Animal_18 animals[] = new Animal_18[4];

    /*
     * Upcasting, always safe
     */
    animals[0] = new Animal_18();
    animals[1] = new Cat_18();
    animals[2] = new Dog_18();
    animals[3] = new Snake_18();

    for(int i = 0; i < animals.length; i++){

      animals[i].speak();
    }
  }
}

class Animal_18{

  public void speak(){

    System.out.println("I am an Animal");
  }
}

class Cat_18 extends Animal_18{

  @Override
  public void speak(){

    System.out.println("Meow");
  }
}

class Dog_18 extends Animal_18{

  @Override
  public void speak(){

    System.out.println("Bark");
  }
}

class Snake_18 extends Animal_18{

  @Override
  public void speak(){

    System.out.println("Hiss");
  }
}