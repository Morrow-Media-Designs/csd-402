/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder Constructors
 */
public class Example_3_01{

  public static void main(String [] args){

    String s_01 = new String("New String");

    // No parameter
    StringBuilder string01 = new StringBuilder();
    // Specified Capacity
    StringBuilder string02 = new StringBuilder(8);
    // String - Literal
    StringBuilder string03 = new StringBuilder("New String Builder");
    // String - Instance
    StringBuilder string04 = new StringBuilder(s_01);

    System.out.println(string01.length());
    System.out.println(string02.length());
    System.out.println(string03.length());
    System.out.println(string04.length());

    System.out.println();

    System.out.println(string01.capacity());
    System.out.println(string02.capacity());
    System.out.println(string03.capacity());
    System.out.println(string04.capacity());
  }
}