/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Nested while Loops
 */
public class Example_302{

  public static void main(String [] args){

    int i = 0;
    int j = 0;

    while(i < 10){

      while(j < 10){

        System.out.printf("%4d", (i * j));

        ++j;
      }

      j = 0;
      ++i;
      System.out.println();
    }
  }
}