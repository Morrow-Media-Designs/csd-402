/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Boxing (Autoboxing) 
 * Unboxing (Autounboxing)
 */
public class Example_1_02{

  public static void main(String [] args){

    Boolean b1 = false;
    Character c1 = 'c';
    Double d1 = 4.5;
    Float f1 = 4.3F;
    Byte by1 = 4;
    Short s1 = 3;
    Integer i1 = 3;
    Long l1 = 656565L;

    boolean b2 = new Boolean(false);
    char c2 = new Character('c');
    double d2 = new Double(4.5);
    float f2 = new Float(4.3);
    byte by2 = new Byte((byte)4);
    short s2 = new Short((short)3);
    int i2 = new Integer(3);
    long l2 = new Long(656565);

    // Tests
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(d1);
    System.out.println(d2);
    // Etc.
  }
}