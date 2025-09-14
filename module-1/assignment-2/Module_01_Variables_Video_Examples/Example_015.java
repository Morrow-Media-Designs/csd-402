/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Increment and Decrement Operators
 *    ++            --
 */
public class Example_015{

  public static void main(String [] args){

    int var_01 = 88;
    double var_02 = 44.33;

    System.out.println();

    System.out.println("\t" + var_01);   // 88
    System.out.println("\t" + ++var_01); // 89
    System.out.println("\t" + var_01);   // 89
    System.out.println("\t" + var_01++); // 89
    System.out.println("\t" + var_01);   // 90


    System.out.println();

    System.out.println("\t" + var_02);   // 44.33
    System.out.println("\t" + ++var_02); // 45.33
    System.out.println("\t" + var_02);   // 45.33
    System.out.println("\t" + var_02++); // 45.33
    System.out.println("\t" + var_02);   // 46.33

    System.out.println();
  }
}