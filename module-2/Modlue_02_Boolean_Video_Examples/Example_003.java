/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Comparison Operators
 *
   == Equal to
   != Not equal to
   > Greater than
   < Less than
   >= Greater than or equal to
   <= Less than or equal to
 */
public class Example_003{

  public static void main(String [] args){

    int var_01 = 6;
    int var_02 = 7;
    int var_03 = 7;

    System.out.println(var_01 == var_02); // false
    System.out.println(var_02 == var_03); // true

    System.out.println();

    System.out.println(var_01 != var_02); // true
    System.out.println(var_02 != var_03); // false

    System.out.println();

    System.out.println(var_01 > var_02); // false
    System.out.println(var_02 > var_03); // false

    System.out.println();

    System.out.println(var_01 >= var_02); // false
    System.out.println(var_02 >= var_03); // true

    System.out.println();

    System.out.println(var_01 < var_02); // true
    System.out.println(var_02 < var_03); // false

    System.out.println();

    System.out.println(var_01 <= var_02); // true
    System.out.println(var_02 <= var_03); // true

    System.out.println();
  }
}