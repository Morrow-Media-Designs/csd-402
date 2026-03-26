/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Integer.parseInt Return
 */
public class Example_110{

  public static void main(String [] args){

    String s1 = "5";
    String s2 = "8";

    int intVar_01 = 0;
    int intVar_02 = 0;

    System.out.println();

    System.out.println(s1 + s2);

    System.out.println();

    System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

    System.out.println();

    intVar_01 = Integer.parseInt(s1);
    intVar_02 = Integer.parseInt(s2);

    System.out.println(intVar_01 + intVar_02);

    System.out.println();
  }
}