/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Operator Precedence
 */
public class Example_013{

  public static void main(String [] args){

    double var_01 = 4.93;
    double var_02 = 5.28;
    double var_03 = 6.38;

    double total = var_01 + var_01 * var_02 + var_02;
    System.out.println("Total = " + total);
    
    total = var_01 + var_01 * (var_02 + var_02);
    System.out.println("Total = " + total);

    total = (var_01 + var_01) * (var_02 + var_02);
    System.out.println("Total = " + total);

    }
}