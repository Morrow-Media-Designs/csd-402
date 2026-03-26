/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Autoboxing and Auto-Unboxing
 */
import java.util.*;

public class Example_1_26{

  public static void main(String [] args){

    List <Integer> myList_01 = new ArrayList <Integer> ();

    int temp = 0;

    for(int i = 0; i < 10; ++i){

      myList_01.add(i); // Autoboxing
    }

    for(int i = 0; i < myList_01.size(); ++i){

      temp = myList_01.get(i); // Auto-Unboxing
      System.out.print(temp + " ");
    }

    System.out.println("\n");
  }
}