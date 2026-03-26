/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Polymorphism
 * Extending a sub class
 * Bulldog extends Dog3 extends Animal3 extends Object
 */
public class Example_1_20{

  public static void main(String[] args){

    Animal_20 animals[] = new Animal_20[3]; // size 4

    /*
     * Here I create 3 of the 4 and assign the references to the array
     */
    animals[0] = new Animal_20();
    animals[1] = new Dog_20();
    animals[2] = new Bulldog_20();

    /*
     * Polymorphic method calls
     */
    for(int i = 0; i < animals.length; i++){

      animals[i].speak();
      System.out.println();
    }
  }
}

/*
 * class Animal3 extends Object{
 * or
 */
class Animal_20{

  public void speak(){

    System.out.println("I am an Animal");
  }
}

class Dog_20 extends Animal_20{

  @Override
  public void speak(){

    System.out.println("Bark");
  }
}

class Bulldog_20 extends Dog_20{

  @Override
  public void speak(){

    System.out.println("Bark Loud");
  }
}