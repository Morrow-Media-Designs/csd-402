/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception - Unchecked Exception
 *
 * ArrayIndexOutOfBoundsException
 */
public class Example_1_01{

  public static void main(String[] args){

    int [] intArray = new int[] {2, 4, 6, 8};

    for(int i = 0; i <= intArray.length; i++){

      System.out.println(intArray[i]);
    }
  }
}