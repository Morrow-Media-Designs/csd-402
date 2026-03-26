/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Variable Scope
 */
public class Example_3_02a{

  public static void main(String [] args){

    // Option 1
    for(int i = 0; i < 5; ++i){

      System.out.println(i);
    }

    System.out.println();

    // Syntax error - Out of scope
    // System.out.println(i);
    // i = 0;

    // New var titled i
    for(int i = 0; i < 5; ++i){

      System.out.println(i);
    }

    System.out.println();

    int i = 0;

    // ---------------------------------------------------
    // Option 2
    for(i = 0; i < 5; ++i){

      System.out.println(i);
    }

    System.out.println();

    System.out.println(i);
    i = 100;
    System.out.println(i);

    System.out.println();

    for(i = 0; i < 5; ++i){

      System.out.println(i);
    }
  }
}