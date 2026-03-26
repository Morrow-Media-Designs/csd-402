/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Comparing Strings
 */
import java.util.*;

public class Example_208{

  public static void main(String [] args){

    String s1 = "Test";
    String s2 = "Test2";
    String s3 = "Test2";

    String s4 = new String("Test");
    String s5 = new String("Test2");
    String s6 = new String("Test2");

    // Avoid using the == operator when comparing Strings
    // This works
    System.out.println(s1 == s2); // False
    System.out.println(s2 == s3); // True

    // Avoid using the == operator when comparing Strings
    // This may not
    System.out.println(s4 == s5); // False
    System.out.println(s5 == s6); // False
  }
}