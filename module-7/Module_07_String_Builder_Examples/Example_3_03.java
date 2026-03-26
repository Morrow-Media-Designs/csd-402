/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder insert(int, String)
 */
public class Example_3_03{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.insert(0, "------");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.insert((13 + 6), "------");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);
  }
}