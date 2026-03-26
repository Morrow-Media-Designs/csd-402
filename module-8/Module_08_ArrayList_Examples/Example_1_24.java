/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declare ArrayList
 * Iterate through ArrayList
 * Fill and Display
 *
 * Doubles
 */
import java.util.*;

public class Example_1_24{

  public static void main(String [] args){

    List <Double> myList_01 = new ArrayList <Double> ();

    // Fill ArrayList
    for(int i = 0; i < 5; ++i){

      myList_01.add(new Double(i * 88.34));
    }

    // "for-each" loop, loop through elements of a collection
    for(Double item : myList_01){

      System.out.printf("%.4f   ", item);
    }

    System.out.println("\n");

    // For loop
    for(int i = 0; i < myList_01.size(); ++i){

      System.out.printf("%.4f   ", myList_01.get(i));
    }

    System.out.println("\n");
  }
}