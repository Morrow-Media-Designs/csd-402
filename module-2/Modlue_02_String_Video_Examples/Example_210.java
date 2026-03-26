/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * indexOf()
 */
import java.util.*;

public class Example_210{

  public static void main(String [] args){

    String s1 = "Test1, Test2, Test3, Test 3, Test 4";
    String s2 = "Test3";

    System.out.println(s1.indexOf(s2)); // 14
    System.out.println(s2.indexOf(s1)); // -1

    System.out.println(s1.indexOf('2')); // 11
    System.out.println(s1.indexOf('3')); // 18
  }
}