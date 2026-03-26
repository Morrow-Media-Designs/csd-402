/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder charAt(int)
 */
public class Example_3_06{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

    System.out.println();

    for(int i = 0; i < stringB01.length(); ++i){

      System.out.print(stringB01.charAt(i) + " ");
    }

    System.out.println("\n");
  }
}