/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Empty String vs. Null String
 *
 * Are they the same?
 */
public class Example_2_13{

  public static void main(String [] args){

    String s1 = "Test";
    String s2 = "";
    String s3 = null;

    System.out.println(s1.length()); // 4
    System.out.println(s2.length()); // 0
    // System.out.println(s3.length()); // Exception

    System.out.println();

    System.out.println(s1.equals(s2)); // String.equals(String) Valid
    System.out.println(s2.equals(s3)); // String.equals(null) Valid
    // System.out.println(s3.equals(s1)); // null.equals(String) Exception
    // System.out.println(s3.equals(s2)); // null.equals(String) Exception
  }
}