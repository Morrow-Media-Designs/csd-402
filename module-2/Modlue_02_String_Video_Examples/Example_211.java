/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Integer.parseInt()
 */
import java.util.*;

public class Example_211{

  public static void main(String [] args){

    String s1 = "2";
    String s2 = "3";
    String s3 = "4";

    int i1;
    int i2;
    int i3;

    System.out.println(s1 + s2 + s3); // 234

    i1 = Integer.parseInt(s1);
    i2 = Integer.parseInt(s2);
    i3 = Integer.parseInt(s3);

    System.out.println(i1 + i2 + i3); // 9

    System.out.println();

    // Error, why?
    System.out.println("The result is: " + i1 + i2 + i3 + "?"); // 234

    System.out.println();
  }
}