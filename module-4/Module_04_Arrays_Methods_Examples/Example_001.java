/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 *  Passing an Array to a Methods
 */
public class Example_001{

  public static void main(String[] args){

    int iArray1[] = new int [10];

    for(int i = 0; i < iArray1.length; ++i){

      iArray1[i] = (int)(Math.random() * 100 + 1);
    }

    Example_001.printIntArray(iArray1);

    // Error Why?
    // Example_001.printIntArray(iArray1[0]);
  }   

  public static void printIntArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      System.out.println(arrayParam[i]);
    }
  }
}