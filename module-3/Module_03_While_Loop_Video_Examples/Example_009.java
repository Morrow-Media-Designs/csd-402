/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Off-By-One Error
 *
 * Goal - Print 1 - 5
 */
public class Example_009{

  public static void main(String [] args){

    int i = 0;

    // Logic error
    while(i <= 5){

      ++i;
      System.out.println("i = " + i);
    }

    i = 0;

    System.out.println();

    // Correction
    while(i < 5){

      ++i;
      System.out.println("i = " + i);
    }
  }
}