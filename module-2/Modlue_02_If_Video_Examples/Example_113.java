/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Boolean Variable Assignment
 */
public class Example_113{

  public static void main(String [] args){

    boolean isEqual = false;
    int intVar_01 = 8;
    int intVar_02 = 9;
    int intVar_03 = 9;

    isEqual = (intVar_01 == intVar_02);

    if(isEqual)
  
      System.out.println("Test 1 " + true);

    isEqual = (intVar_02 == intVar_03);

    if(isEqual)
  
      System.out.println("Test 2 " + true);
  }
}