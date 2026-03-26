/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Logic Error
 */
public class Example_105{

  public static void main(String [] args){

    int var_01 = 99;
    int var_02 = 99;
    int var_03 = 100;

    System.out.println();

    if(var_01 == var_02)

      System.out.println("Equal");
      System.out.println("Equal");

    System.out.println();

    if(var_02 == var_03)

      System.out.println("Equal");
      System.out.println("Equal");

    System.out.println();
  }
}