/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Avoid
 *
 * double == double
 * float == float
 *
 * Is the output correct?  Why?
 *
 */
public class Example_106{

  public static void main(String [] args){

    double var_01 = 2.00 - 1.10;
    double var_02 = 0.90;

    System.out.println();

    if(var_01 == var_02){

      System.out.println("Equal");
    }

    System.out.println();

    if(var_01 != var_02){

      System.out.println("Not Equal");
    }

    System.out.println();
  }
}