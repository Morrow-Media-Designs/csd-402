/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Comparing Strings
 */
import java.util.*;

public class Example_209{

  public static void main(String [] args){

    String s1 = "Test";
    String s2 = "Test2";
    String s3 = "Test2";

    String s4 = new String("Test");
    String s5 = new String("Test2");
    String s6 = new String("Test2");

    // This shoudl solve the problem
    System.out.println(s1.equals(s2)); // False
    System.out.println(s2.equals(s3)); // True

    System.out.println(s4.equals(s5)); // False
    System.out.println(s5.equals(s6)); // True
  }
}