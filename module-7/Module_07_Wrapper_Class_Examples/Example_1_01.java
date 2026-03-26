/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declare Wrapper Instances
 *
 * Primitive Data Types as Objects
 *
 * Boolean, Character, Double, Float, 
 * Byte, Short, Integer, and Long
 */
public class Example_1_01{

  public static void main(String [] args){

    Boolean b1 = new Boolean(false);
    // Errors 
    // Boolean b2 = new Boolean("false");
    // Boolean b3 = new Boolean(0);

    Character c1 = new Character('c');
    // Error
    // Character c2 = new Character("c");

    Double d1 = new Double(4.5);
    Double d2 = new Double("4.5");

    Float f1 = new Float(4.3);
    Float f2 = new Float("4.3");

    Byte by1 = new Byte((byte)4);
    Byte by2 = new Byte("5");

    Short s1 = new Short((short)3);
    Short s2 = new Short("23");

    Integer i1 = new Integer(77);
    Integer i2 = new Integer("77");

    Long l1 = new Long(656565);
    Long l2 = new Long("7656565");
  }
}