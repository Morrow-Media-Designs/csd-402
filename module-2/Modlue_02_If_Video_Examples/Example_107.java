/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * if( (operation) boolean expression)
 */
public class Example_107{

  public static void main(String [] args){

    int var_01 = 99;
    int var_02 = 3;
    int var_03 = 88;

    double d_01 = 99.00;
    double d_02 = 3.0;

    System.out.println(var_01 % var_02);
    System.out.println(var_01 % 2);
    System.out.println(88 % var_02);

    System.out.println();

    System.out.println(d_01 % d_02);
    System.out.println(d_01 % 2);
    System.out.println(88 % d_02);

    System.out.println();

    if(var_01 % 2 == 0){

      System.out.println("Even");
    }

    if(var_01 % 2 != 0){

      System.out.println("Odd");
    }

    System.out.println();

    if(var_03 % 2 == 0){

      System.out.println("Even");
    }

    if(var_03 % 2 != 0){

      System.out.println("Odd");
    }

    System.out.println();
  }
}