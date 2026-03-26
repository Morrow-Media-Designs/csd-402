/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder length() & capacity()
 */
public class Example_3_07{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder();

    System.out.println(stringB01.length());
    System.out.println(stringB01.capacity());

    stringB01.append("abcdefghijklmnopqrstuvwxyz");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01.capacity());

    stringB01.append("abcdefghijklmnopqrstuvwxyz");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01.capacity());
  }
}