/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * New Arrays
 */
public class Example_116{

  public static void main(String[] args){

    /*
     * First array is created
     */
    int[] iArray = new int[5];

    // Fill array
    for(int i = 0; i < iArray.length; i++){

      iArray[i] = i + 1;
    }

    // Print array
    for(int i = 0; i < iArray.length; i++){

      System.out.print(iArray[i] + " ");
    }

    System.out.println();

    /*
     * Second array is created
     * Same variable name
     * First array is marked for removal
     */
    iArray = new int[8];

    // Print new array
    for(int i = 0; i < iArray.length; i++){

      System.out.print(iArray[i] + " ");
    }

    System.out.println();

    // Fill new array
    for(int i = 0; i < iArray.length; i++){

      iArray[i] = i + 1;
    }

    // Print new values
    for(int i = 0; i < iArray.length; i++){

      System.out.print(iArray[i] + " ");
    }

    System.out.println();
  }
}