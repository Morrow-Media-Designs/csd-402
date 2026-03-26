/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 *  Methods to Print and Fill Arrays
 */
public class Example_003{

  public static void main(String[] args){

    int iArray1[] = new int [6];
    int iArray2[] = new int [8];

    // Print arrays
    Example_003.printMyArray(iArray1);
    System.out.printf("%n");
    Example_003.printMyArray(iArray2);
    System.out.printf("%n%n");

    // Fill arrays
    Example_003.fillMyArray(iArray1);
    System.out.printf("%n");
    Example_003.fillMyArray(iArray2);
    System.out.printf("%n%n");

    // Print arrays
    Example_003.printMyArray(iArray1);
    System.out.printf("%n");
    Example_003.printMyArray(iArray2);
    System.out.printf("%n%n");
  }   

  public static void printMyArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; i++){

      System.out.print("[" + i + "] = " + arrayParam[i]);

      if(i < arrayParam.length - 1){

        System.out.print(", ");
      }
    }

    System.out.println("\n");
  }

  public static void fillMyArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      arrayParam[i] = (int)(Math.random() * 10);
    }
  }
}