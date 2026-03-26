/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Constructors with arguments
 * No default constructor in the base class
 */
public class Example_1_11{

  public static void main(String [] args){

    // Error
    // Animal_11 a1 = new Animal_11();
    // System.out.println(a1.getName());
    
    Cat_11 c1 = new Cat_11();
    System.out.println(c1.getName());
    System.out.println();

    System.out.println();

    Dog_11 d1 = new Dog_11();
    System.out.println(d1.getName());
    System.out.println();

    System.out.println();

    Animal_11 a2 = new Animal_11("Moe");
    System.out.println(a2.getName());
    System.out.println();

    System.out.println();
    
    Cat_11 c2 = new Cat_11("Larry");
    System.out.println(c2.getName());
    System.out.println();

    Dog_11 d2 = new Dog_11("Curly");
    System.out.println(d2.getName());

    System.out.println();
    System.out.println();

    Animal_11 a3 = new Animal_11("Moe 3");
    System.out.println(a3.getName());

    System.out.println();
    
    Animal_11 c3 = new Cat_11("Larry 3");
    System.out.println(c3.getName());

    System.out.println();

    Animal_11 d3 = new Dog_11("Curly 3");
    System.out.println(d3.getName());
  }
}

class Animal_11{

  private String name;

  public Animal_11(String name){

    this.name = name;

    System.out.println("Animal_11(String)");
  }

  public String getName(){

    return name;
  }
}

class Cat_11 extends Animal_11{

  public Cat_11(){

    super("From a Cat");

    System.out.println("Cat_11 Constructor()");
  }

  public Cat_11(String name){

    super(name);

    System.out.println("Cat_11 Constructor(String)");
  }
}

class Dog_11 extends Animal_11{

  public Dog_11(){

    super("From a Dog");

    System.out.println("Dog_11 Constructor()");
  }

  public Dog_11(String name){

    super(name);

    System.out.println("Dog_11 Constructor(String)");
  }
}