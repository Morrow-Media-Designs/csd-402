/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Filled with a new class
 * ArrayList of Data_L_01s
 *
 * toString Method
 */
import java.util.*;

public class Example_1_27{

  public static void main(String [] args){

    List <Data_L_01> myList_01 = new ArrayList <Data_L_01> ();

    for(int i = 0; i < 5; ++i){

      myList_01.add(new Data_L_01());
    }

    for(Data_L_01 item : myList_01){

      System.out.println(item); // Invoke toString()
    }

    System.out.println("\n");

    for(int i = 0; i < myList_01.size(); ++i){

      System.out.println(myList_01.get(i)); // Invoke toString()
    }

    System.out.println("\n");
  }
}

// Note - This cannot be a public class
class Data_L_01 extends Object{

  private int i = (int)(Math.random() * 6 + 1);
  private long l = (long)(Math.random() * 6 + 1);
  private float f = (float)(Math.random() * 6 + 1);

  // Usually common to have getters and setters
  public void setI(int i){

    this.i = i;
  }

  public void setL(long l){

    this.l = l;
  }

  public void setF(float f){

    this.f = f;
  }

  public int getI(){

    return i;
  }

  public long getL(){

    return l;
  }

  public float getF(){

    return f;
  }

  @Override
  public String toString(){

    return (
            Integer.toString(i) + "\t" +
            Long.toString(l) + "\t" +
            Float.toString(f));
  }
}