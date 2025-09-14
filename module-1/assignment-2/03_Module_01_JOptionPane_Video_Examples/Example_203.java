/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Logic Error
 */
public class Example_203{

  public static void main(String [] args){

    // Desired output is 4
    System.out.println(100 / 2 + 23); // Output is 73

    // Correct output of 4
    System.out.println(100 / (2 + 23)); // Output is 4
  }
}