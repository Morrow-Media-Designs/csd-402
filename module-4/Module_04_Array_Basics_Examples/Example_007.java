/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Array primitives
 */
public class Example_007{

  public static void main(String[] args){

    final int ARRAY_SIZE = 5;

    int iArray[] = null;
  
    System.out.println();
 
    /*
     * Array has not been created
     * System.out.println(iArray[0]); // Error
     */
    System.out.println("iArray = " + iArray); // Prints null

    /*
     * Array Object is created
     */
    iArray = new int[ARRAY_SIZE];

    System.out.println();

    for(int i = 0; i < iArray.length; i++){
      /*
       * Prints array values
       *
       * At this point all array values are 0
       */
      System.out.println("iArray[" + i + "] = " + iArray[i]);
    }

    for(int i = 0; i < iArray.length; i++){
      /*
       * Assign array values
       */
      iArray[i] = i;
    }

    System.out.println();

    for(int i = 0; i < iArray.length; i++){
      /*
       * Prints array values
       */
      System.out.println("iArray[" + i + "] = " + iArray[i]);
    }
  }
}