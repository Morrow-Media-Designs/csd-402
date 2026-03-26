/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Integer Methods
 */
public class Example_1_03{

  public static void main(String [] args){

    Integer i1 = new Integer(7);
    int i2 = 2;

    System.out.println();

    testInstance(i1);

    System.out.println();
    System.out.println();

    testInstance(i1.byteValue());
    testInstance(i1.shortValue());
    testInstance(i1.intValue());
    testInstance(i1.doubleValue());
    testInstance(i1.floatValue());
    testInstance(i1.longValue());

    // Errors
    // System.out.println(i2.byteValue());
    // System.out.println(i2.intValue());
    // testInstance(i2.intValue());
    // testInstance(i2.intValue());

    System.out.println();
    System.out.println();

    testInstance(i2);

    System.out.println();
  }

  public static void testInstance(Object o){

    if(o instanceof Boolean)
      System.out.println("Boolean");
    if(o instanceof Character)
      System.out.println("Character");
    if(o instanceof Double)
      System.out.println("Double");
    if(o instanceof Float)
      System.out.println("Float");
    if(o instanceof Byte)
      System.out.println("Byte");
    if(o instanceof Short)
      System.out.println("Short");
    if(o instanceof Integer)
      System.out.println("Integer");
    if(o instanceof Long)
      System.out.println("Long");
  }
}