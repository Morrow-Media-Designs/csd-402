/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Character
 *
 * Avoid ==
 */
public class Example_2_03{

  public static void main(String [] args){

    Character CharObject1 = new Character('A');
    Character CharObject2 = new Character('a');
    Character CharObject3 = new Character('B');
    Character CharObject4 = new Character('B');
    Character CharObject5 = new Character('A');

    System.out.println(CharObject1 == CharObject1); // True
    System.out.println(CharObject2 == CharObject2); // True
    System.out.println(CharObject1 == CharObject5); // False
    System.out.println(CharObject3 == CharObject4); // False

    System.out.println();

    // This will work, however you should avoid using this
    System.out.println(CharObject1 == 'A'); // True
    System.out.println(CharObject2 == 'a'); // True
    System.out.println(CharObject1 == ' '); // False

    System.out.println();

    // Avoid this
    System.out.println(CharObject1 == 'A'); // True
    System.out.println(CharObject5 == 'A'); // True
    System.out.println(CharObject1 == CharObject5); // False
  }
}