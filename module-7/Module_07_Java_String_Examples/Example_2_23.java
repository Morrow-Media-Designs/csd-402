/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * String.matches()
 */
import java.util.*;

public class Example_2_23{

  public static void main(String[] args){

    String s1 = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    String s2 = new String("ABCDEFGH");

    System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".matches("ABCDEFGH.*")); // True

    System.out.println(s1.matches("ABCDEFGH.*")); // True

    System.out.println(s1.matches(s2 + ".*")); // True

    System.out.println(s2.matches(s1 + ".*")); // False
  }
}