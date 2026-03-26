/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_008{

  public static void main(String [] args){

    int i = 0;
    int sum = 0;

    while(i < 10){

      sum += i;
      System.out.println("Sum = " + sum);
      ++i;
    }

    // Reset the values
    i = 0;
    sum = 0;

    System.out.println();

    // or
    while(i < 10){

      sum = sum + i;
      System.out.println("Sum = " + sum);
      ++i;
    }
  }
}