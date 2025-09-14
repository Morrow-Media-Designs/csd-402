/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Argument Assignment Operators
 */
public class Example_014{

  public static void main(String [] args){

    int var_01 = 88;
    double var_02 = 44.33;

    System.out.println();

    var_01 += 3;
    System.out.println("\t" + var_01);
    var_01 -= 1;
    System.out.println("\t" + var_01);
    var_01 /= 2;
    System.out.println("\t" + var_01);
    var_01 *= 3;
    System.out.println("\t" + var_01);
    var_01 %= 7;
    System.out.println("\t" + var_01);

    System.out.println();

    var_02 += 3;
    System.out.println("\t" + var_02);
    var_02 -= 1;
    System.out.println("\t" + var_02);
    var_02 /= 2;
    System.out.println("\t" + var_02);
    var_02 *= 3;
    System.out.println("\t" + var_02);
    // Can we do this in Java?
    var_02 %= 7;
    System.out.println("\t" + var_02);

    System.out.println();
  }
}