/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * if();
 * Logic Error
 */
public class Example_110{

  public static void main(String [] args){

    int intVar_01 = 9;
    int intVar_02 = 0;
    int intVar_03 = 9;

    // Logic Error
    if(intVar_01 == intVar_02);
      
      System.out.println("intVar_01(" + intVar_01 + ") == intVar_02(" + intVar_02 + ") = " + true);

    // Logic Error
    if(intVar_02 == intVar_03);
  
      System.out.println("intVar_02(" + intVar_02 + ") == intVar_03(" + intVar_03 + ") = " + true);

    // Logic Error
    if(intVar_03 == intVar_01);
  
      System.out.println("intVar_03(" + intVar_03 + ") == intVar_01(" + intVar_01 + ") = " + true);
  }
}