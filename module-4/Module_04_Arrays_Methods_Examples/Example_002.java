/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 *  Pass Array or Array Element to Method
 */
public class Example_002{

  public static void main(String[] args){

    int iArray1[] = new int [10];

    for(int i = 0; i < iArray1.length; ++i){

      iArray1[i] = (int)(Math.random() * 100 + 1);
    }

    Example_002.printIntArray(iArray1);

    System.out.printf("%n%n");

    // Corrected
    Example_002.printIntElement(iArray1[0]);

    System.out.printf("%n%n");
  }   

  public static void printIntArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      System.out.println(arrayParam[i]);
    }
  }

  public static void printIntElement(int arrayElement){

    System.out.println(arrayElement);
  }
}