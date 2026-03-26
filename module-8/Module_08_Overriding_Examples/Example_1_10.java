/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Constructors with Arguments
 */
public class Example_1_10{

  public static void main(String [] args){

    Animal_10 a1 = new Animal_10();
    System.out.println(a1.getName());

    System.out.println();
    
    Cat_10 c1 = new Cat_10();
    System.out.println(c1.getName());

    System.out.println();

    Dog_10 d1 = new Dog_10();
    System.out.println(d1.getName());

    System.out.println();

    System.out.println();

    Animal_10 a2 = new Animal_10("Moe");
    System.out.println(a2.getName());
    
    System.out.println();

    Cat_10 c2 = new Cat_10("Larry");
    System.out.println(c2.getName());

    Dog_10 d2 = new Dog_10("Curly");
    System.out.println(d2.getName());

    System.out.println();

    System.out.println();
    System.out.println();

    Animal_10 a3 = new Animal_10("Moe 3");
    System.out.println(a3.getName());
    
    System.out.println();

    Animal_10 c3 = new Cat_10("Larry 3");
    System.out.println(c3.getName());

    System.out.println();

    Animal_10 d3 = new Dog_10("Curly 3");
    System.out.println(d3.getName());
  }
}

class Animal_10{

  private String name;

  public Animal_10(){

    this.name = "No name";

    System.out.println("Animal_10()");
  }

  public Animal_10(String name){

    this.name = name;

    System.out.println("Animal_10(String)");
  }

  public String getName(){

    return name;
  }
}

class Cat_10 extends Animal_10{

  public Cat_10(){

    super();

    System.out.println("Cat_10 Constructor()");
  }

  public Cat_10(String name){

    super(name);

    System.out.println("Cat_10 Constructor(String)");
  }
}

class Dog_10 extends Animal_10{

  public Dog_10(){

    super();

    System.out.println("Dog_10 Constructor()");
  }

  public Dog_10(String name){

    super(name);

    System.out.println("Dog_10 Constructor(String)");
  }
}