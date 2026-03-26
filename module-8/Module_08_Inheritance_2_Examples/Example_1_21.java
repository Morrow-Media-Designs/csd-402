/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Downcasting - Not Always Safe
 */
public class Example_1_21{


  public static void main(String[] args){

    Animal_21 animals[] = new Animal_21[4];

    // Upcasting is always safe
    animals[0] = new Animal_21();
    animals[1] = new Cat_21();
    animals[2] = new Dog_21();
    animals[3] = new Snake_21();

    for(int i = 0; i < animals.length; i++){

      animals[i].speak();
    }

    System.out.println();
    System.out.println();

    // Downcasting, not always safe, so I will test first
    for(int i = 0; i < animals.length; i++){

      /*
       * How many of these are Animals?
       * 1?
       * All?
       */
      if(animals[i] instanceof Animal_21){
        System.out.println("I am an Animal");
      }
      if(animals[i] instanceof Cat_21){
        ((Cat_21)animals[i]).catMethod();
      }
      if(animals[i] instanceof Dog_21){
        ((Dog_21)animals[i]).dogMethod();
      }
      if(animals[i] instanceof Snake_21){
        ((Snake_21)animals[i]).snakeMethod();
      }

      System.out.println();
    }
  }
}

class Animal_21{

  // Not an overridden method
  public void speak(){

    System.out.println("I am an Animal");
  }
}

class Cat_21 extends Animal_21{

  public void catMethod(){

    System.out.println("catMethod");
  }
}

class Dog_21 extends Animal_21{

  public void dogMethod(){

    System.out.println("dogMethod");
  }
}

class Snake_21 extends Animal_21{

  public void snakeMethod(){

    System.out.println("snakeMethod");
  }
}