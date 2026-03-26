/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * StringBuilder append()
 */
public class Example_3_02{

  public static void main(String [] args){

    StringBuilder stringB01 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.append("------");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);

    stringB01.append("&&&&&&");
    System.out.println();

    System.out.println(stringB01.length());
    System.out.println(stringB01);
  }
}