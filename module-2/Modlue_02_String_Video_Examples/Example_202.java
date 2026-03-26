/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * println() & printf()
 */

public class Example_202{

  public static void main(String [] args){

    String localString = "Hello World";

    System.out.println("The string says, \"" + localString + "\".");

    System.out.printf("The string says, \"%s\".%n", localString);
  }
}