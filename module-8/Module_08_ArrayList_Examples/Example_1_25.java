/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Add items without loop
 */
import java.util.*;

public class Example_1_25{

  public static void main(String [] args){

    List <String> myList_01 = new ArrayList <String> ();

    myList_01.add("Moe");
    myList_01.add("Larry");
    myList_01.add("Curly");
    myList_01.add("Joe");
    myList_01.add("Curly Joe");

    // "for-each" loop, loop through elements of a collection
    for(String item : myList_01){

      System.out.printf("%s   ", item);
    }

    System.out.println("\n");
  }
}