/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Strings?
 */
public class Example_3_01a{

  public static void main(String [] args){

    String s1 = new String("String 1");
    System.out.println(s1);

    // Is a String an Immutable object
    // Yes
    // So does this change the String - No
    // It creates a new String
    s1 = "String 2";
    System.out.println(s1);
  }
}