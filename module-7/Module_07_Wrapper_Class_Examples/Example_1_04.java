/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Integer Methods
 */
public class Example_1_04{

  public static void main(String [] args){

    Double d1 = new Double(7.88);
    double d2 = 77.22;

    System.out.println();

    testInstance(d1);

    System.out.println();
    System.out.println();

    testInstance(d1.byteValue());
    testInstance(d1.shortValue());
    testInstance(d1.intValue());
    testInstance(d1.doubleValue());
    testInstance(d1.floatValue());
    testInstance(d1.longValue());

    System.out.println(d1.intValue());

    // Errors
    // System.out.println(d2.byteValue());
    // System.out.println(d2.intValue());
    // testInstance(d2.intValue());
    // testInstance(d2.intValue());

    System.out.println();
    System.out.println();

    testInstance(d2);

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