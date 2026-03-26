/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * newToString()
 * 
 */
import java.util.*;

public class Example_1_29{

  public static void main(String [] args){

    List <Data_L_03> myList_01 = new ArrayList <Data_L_03> ();

    for(int i = 0; i < 10; ++i){

      myList_01.add(new Data_L_03());
    }

    for(Data_L_03 item : myList_01){

      System.out.println(item.newToString());
    }

    System.out.println("\n");
  }
}

class Data_L_03 extends Object{

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

  // Does not override a method
  public String newToString(){

    return (
            "newToString-" +
            Integer.toString(i) + "\t" +
            Long.toString(l) + "\t" +
            Float.toString(f));
  }
}