/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declare ArrayList
 * Iterate through ArrayList
 * Fill and Display
 *
 * Integers
 */
import java.util.*;

public class Example_1_23{

  public static void main(String [] args){

    List <Integer> myList_01 = new ArrayList <Integer> ();

    // Fill ArrayList
    for(int i = 0; i < 10; ++i){

      myList_01.add(new Integer(i));
    }

    // "for-each" loop, loop through elements of a collection
    for(Integer item : myList_01){

      System.out.print(item + " ");
    }

    System.out.println("\n");

    // For loop
    for(int i = 0; i < myList_01.size(); ++i){

      System.out.print(myList_01.get(i) + " ");
    }

    System.out.println("\n");
  }
}