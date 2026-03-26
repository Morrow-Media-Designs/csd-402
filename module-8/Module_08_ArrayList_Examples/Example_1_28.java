/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * List <Object>
 * ArrayList of Data_L_01s and Strings
 *
 * toString Method
 */
import java.util.*;

public class Example_1_28{

  public static void main(String [] args){

    List <Object> myList_01 = new ArrayList <Object> ();

    myList_01.add(new String("Moe"));
    myList_01.add(new Data_L_02());
    myList_01.add(new String("Larry"));
    myList_01.add(new Data_L_02());
    myList_01.add(new String("Curly"));
    myList_01.add(new Data_L_02());

    for(Object item : myList_01){

      System.out.println(item); // Invoke toString()
    }

    System.out.println("\n");
    System.out.println("\n");
  }
}

// Note - This cannot be a public class
class Data_L_02 extends Object{

  private int i = (int)(Math.random() * 6 + 1);
  private long l = (long)(Math.random() * 6 + 1);
  private float f = (float)(Math.random() * 6 + 1);

  // Removed setters and getters to make example simpler

  @Override
  public String toString(){

    return (
            Integer.toString(i) + "\t" +
            Long.toString(l) + "\t" +
            Float.toString(f));
  }
}