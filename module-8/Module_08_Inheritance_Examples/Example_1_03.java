/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_1_03{

  public static void main(String [] args){

    System.out.println();
    Animal_03 a3 = new Animal_03();
    System.out.println();
    Cat_03 c3 = new Cat_03();
    System.out.println();
    Dog_03 d3 = new Dog_03();
    System.out.println();
    Snake_03 s3 = new Snake_03();
    System.out.println();
  }
}

class Animal_03{

  public Animal_03(){

    System.out.println("Animal_03 constructor");
  }
}

class Cat_03 extends Animal_03{

  public Cat_03(){

    System.out.println("Cat_03 constructor");
  }
}

class Dog_03 extends Animal_03{

  public Dog_03(){

    System.out.println("Dog_03 constructor");
  }
}

class Snake_03 extends Animal_03{

  public Snake_03(){

    System.out.println("Snake_03 constructor");
  }
}