/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * charAt()
 */

public class Example_203{

  public static void main(String [] args){

    String localString = "Welcome";

    System.out.print(localString.charAt(0));
    System.out.print(localString.charAt(1));
    System.out.print(localString.charAt(2));
    System.out.print(localString.charAt(3));
    System.out.print(localString.charAt(4));
    System.out.print(localString.charAt(5));
    System.out.println(localString.charAt(6));
    // Error, beyond the length of the String
    // System.out.print(localString.charAt(7));
  }
}