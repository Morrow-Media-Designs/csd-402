/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder delete(int, String)
 */
public class Example_3_04{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.delete(0, 1);
    System.out.println();
    // or 

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.deleteCharAt(0);
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.delete(0, 3);
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.delete(0, 5);
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);
  }
}