/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * String.matches() - Phone Number
 */
import java.util.*;

public class Example_2_24{

  public static void main(String[] args){

    String s1 = new String("402-555-1234");
    String s2 = new String("618-555-2345");
    String s3 = new String("777-555-34546");
    String matchPattern = new String("\\d{3}-\\d{3}-\\d{4}");

    System.out.println("402-555-1234".matches("\\d{3}-\\d{3}-\\d{4}")); // True
    System.out.println("618-555-2345".matches("\\d{3}-\\d{3}-\\d{4}")); // True
    System.out.println("777-555-34568".matches("\\d{3}-\\d{3}-\\d{4}")); // False
    System.out.println("777-4555-34568".matches("\\d{3}-\\d{3}-\\d{4}")); // False

    System.out.println();

    System.out.println(s1.matches("\\d{3}-\\d{3}-\\d{4}")); // True
    System.out.println(s2.matches("\\d{3}-\\d{3}-\\d{4}")); // True
    System.out.println(s3.matches("\\d{3}-\\d{3}-\\d{4}")); // False

    System.out.println();

    System.out.println(s1.matches(matchPattern)); // True
    System.out.println(s2.matches(matchPattern)); // True
    System.out.println(s3.matches(matchPattern)); // False
  }
}