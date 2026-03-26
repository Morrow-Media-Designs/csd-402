/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * instanceof operator
 * Downcast
 */
import java.util.*;

public class Example_1_31{

  public static void main(String [] args){

    List <Object> myList_01 = new ArrayList <Object> ();

    myList_01.add(new Data_L_05());
    myList_01.add(new String("Moe"));
    myList_01.add(new Data_L_05());
    myList_01.add(new String("Larry"));
    myList_01.add(new Data_L_05());
    myList_01.add(new String("Curly"));
    myList_01.add(new Data_L_05());

    for(Object item : myList_01){

      if(item instanceof Data_L_05){

        // Safe to downcast here
        System.out.println(((Data_L_05)item).newToString());
      }
      else{

        System.out.println(item);
      }
    }

    System.out.println("\n");
  }
}

class Data_L_05 extends Object{

  private int i = (int)(Math.random() * 6 + 1);
  private long l = (long)(Math.random() * 6 + 1);
  private float f = (float)(Math.random() * 6 + 1);

  @Override
  public String toString(){

    return (
            Integer.toString(i) + "\t" +
            Long.toString(l) + "\t" +
            Float.toString(f));
  }

  public String newToString(){

    return (
            "newToString - " +
            Integer.toString(i) + "\t\t" +
            Long.toString(l) + "\t" +
            Float.toString(f));
  }
}