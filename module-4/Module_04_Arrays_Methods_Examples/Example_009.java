/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Ellipsis Method and Enhanced 'for' Loop
 */
public class Example_009{

  public static void main(String [] args){

    int [] myArray1 = {3, 5, 7, 9};
    int [] myArray2 = {13, 15, 17, 19};

    Example_009.ellipsisMethod(2, 4, 6, 8, 0, 0, 1, 1);

    ellipsisMethod(myArray1);

    Example_009.ellipsisMethod(12, 14, 16, 18, 88, 77, 66, 55);

    Example_009.ellipsisMethod(myArray2);
  }

  public static void ellipsisMethod(int... params){

    for(int i : params){

      System.out.print(i + " ");
    }

    System.out.println();
  }
}