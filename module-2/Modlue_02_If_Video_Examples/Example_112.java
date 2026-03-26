/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Syntax/Logic Error
 */
public class Example_112{

  public static void main(String [] args){

    boolean boolVar_01 = false;
    boolean boolVar_02 = true;

    int intVar_01 = 7;
    int intVar_02 = 9;

    // Logic Error
    if(boolVar_01 = boolVar_02)
  
      System.out.println("boolVar_01(" + boolVar_01 + ") == boolVar_02(" + boolVar_02 + ") = " + true);

    // Syntax Error
    if(intVar_01 = intVar_02)
  
      System.out.println("intVar_01(" + intVar_01 + ") == intVar_02(" + intVar_02 + ") = " + true);
  }
}