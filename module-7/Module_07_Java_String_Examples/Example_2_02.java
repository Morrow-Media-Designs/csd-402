/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Character
 *
 * equals()
 */
public class Example_2_02{

  public static void main(String [] args){

    Character CharObject1 = new Character('A');
    Character CharObject2 = new Character('a');
    Character CharObject3 = new Character('B');
    Character CharObject4 = new Character('b');
    Character CharObject5 = new Character('A');

    System.out.println(CharObject1.equals('A')); // True
    System.out.println(CharObject2.equals('A')); // False
    System.out.println(CharObject3.equals('A')); // False
    System.out.println(CharObject4.equals('A')); // False
    System.out.println(CharObject5.equals('A')); // True

    System.out.println();

    System.out.println(CharObject1.equals('B')); // False
    System.out.println(CharObject2.equals('B')); // False
    System.out.println(CharObject3.equals('B')); // True
    System.out.println(CharObject4.equals('B')); // False
    System.out.println(CharObject5.equals('B')); // False

    System.out.println();

    System.out.println(CharObject1.equals(CharObject2)); // False
    System.out.println(CharObject1.equals(CharObject5)); // True

    System.out.println();

    System.out.println(CharObject1.equals(Character.toUpperCase(CharObject2))); // True
    System.out.println(CharObject1.equals(Character.toUpperCase(CharObject3))); // False
    System.out.println(CharObject3.equals(Character.toUpperCase(CharObject4))); // True
    System.out.println(CharObject3.equals(Character.toUpperCase(CharObject5))); // False

    System.out.println();
  }
}