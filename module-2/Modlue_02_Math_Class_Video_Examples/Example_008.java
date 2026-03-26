/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * random() Returns a random number 0 <= x < 1.0
 * Return double
 */
public class Example_008{

  public static void main(String [] args){

    // 0 <= x < 1.0
    System.out.println(Math.random());
    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    System.out.println((int)(Math.random() * 10));
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    System.out.println((int)(Math.random() * 10 + 1));
    // 0 to 100
    System.out.println((int)(Math.random() * 101));
  }
}