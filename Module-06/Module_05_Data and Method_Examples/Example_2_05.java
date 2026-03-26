/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Java library class Random
 */
import java.util.*;

public class Example_2_05{

  public static void main(String [] args){

    /*
     * No seed used
     */
    Random rand = new Random();

    int largest = 0, smallest = 100;
    int randNumber = 0;

    for(int i = 0; i < 100000; ++i){

      /*
       * Random 0 - 99
       */
      //randNumber = (int)rand.nextInt(100);

      /*
       * Random 1 - 100
       */
      randNumber = (int)rand.nextInt(100);

      if(randNumber > largest){
      
        largest = randNumber;
      }
      if(randNumber < smallest){
      
        smallest = randNumber;
      }
    }

    System.out.println("Largest = " + largest);
    System.out.println("Smallest = " + smallest);
  }
}