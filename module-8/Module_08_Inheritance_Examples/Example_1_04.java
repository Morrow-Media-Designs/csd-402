/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_04{

  public static void main(String [] args){

    Animal_04 a4 = new Animal_04();

    Cat_04 c4 = new Cat_04();
    Dog_04 d4 = new Dog_04();

    System.out.println();

    System.out.println("Animal ID = " + a4.getId());

    System.out.println("Cat ID = " + c4.getId());
    System.out.println("Dog ID = " + d4.getId());

    System.out.println();

    c4.printCat();
    d4.printDog();

    // Errors

    // a4.printCat();
    // a4.printDog();

    // c4.printDog();
    // d4.printCat();
  }
}

class Animal_04{

  int id = (int)(Math.random() * 100000 + 1);

  public int getId(){

    return id;
  }
}

class Cat_04 extends Animal_04{

  public Cat_04(){

    System.out.println("Cat_04 constructor");
  }

  public void printCat(){

    System.out.println("Print Cat Method");
  }
}

class Dog_04 extends Animal_04{

  public Dog_04(){

    System.out.println("Dog_04 constructor");
  }

  public void printDog(){

    System.out.println("Print Dog Method");
  }
}