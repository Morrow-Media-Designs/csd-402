/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder reverse()
 */
public class Example_3_05{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
    StringBuilder stringB02 = new StringBuilder();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.reverse();
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    System.out.println();

    stringB02 = stringB01.reverse();
    System.out.println(stringB02.length());
    System.out.println(stringB02);

  }
}