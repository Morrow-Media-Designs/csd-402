 /*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Boolean Expressions or Assignment?
 */
public class Example_002{

  public static void main(String [] args){

    int var_01 = 6;
    int var_02 = 7;
    int var_03 = 8;
    int var_04 = 8;

    // These lines are using an assignment operator
    // These are not boolean results
    System.out.println("" + var_01 + " = " + var_02 + " is " + (var_01 = var_02) );
    System.out.println("" + var_02 + " = " + var_03 + " is " + (var_02 = var_03) );
    System.out.println("" + var_03 + " = " + var_04 + " is " + (var_03 = var_04) );
    System.out.println("" + var_04 + " = " + var_01 + " is " + (var_04 = var_01) );
  }
}