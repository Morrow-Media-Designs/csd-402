/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Double.valueOf Return
 */
public class Example_111{

  public static void main(String [] args){

    String s1 = "5.64";
    String s2 = "3.52";

    double doubleVar_01 = 0.0;
    double doubleVar_02 = 0.0;

    System.out.println();

    System.out.println(s1 + s2);

    System.out.println();

    System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2));

    System.out.println();

    doubleVar_01 = Double.parseDouble(s1);
    doubleVar_02 = Double.parseDouble(s2);

    System.out.println(doubleVar_01 + doubleVar_02);

    System.out.println();
  }
}