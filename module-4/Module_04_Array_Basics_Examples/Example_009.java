/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using short-cut notation to assign values
 * Declare Array references
 * Then create Array objects and Initialize values
 *
 * Previous Errors Corrected
 */
public class Example_009{

  public static void main(String[] args){

    int [] iArray = null;
    double [] dArray = null;

    // iArray= {1, 2, 3, 4, 5, 6, 7};
    iArray = new int [] {1, 2, 3, 6, 5, 4};
    // dArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    dArray = new double [] {1.5, 2.6, 3.7, 6.8, 5.9, 4.0};

    for(int i = 0; i < iArray.length; i++){

      System.out.println("iArray[" + i + "] = " + iArray[i]);
    }

    System.out.println();

    for(int i = 0; i < dArray.length; i++){

      System.out.println("dArray[" + i + "] = " + dArray[i]);
    }
  }
}