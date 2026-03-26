/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_109{

  public static void main(String [] args){

    int intVar_01 = 9;
    int intVar_02 = 0;
    int intVar_03 = 9;

    // Syntax Error - Assignment operator
    // if(intVar_01 = intVar_02)
    // if(intVar_02 = intVar_03)
    // if(intVar_03 = intVar_01)

    if(intVar_01 == intVar_02)
  
      System.out.println("intVar_01(" + intVar_01 + ") == intVar_02(" + intVar_02 + ") = " + true);

    if(intVar_02 == intVar_03)
  
      System.out.println("intVar_02(" + intVar_02 + ") == intVar_03(" + intVar_03 + ") = " + true);

    if(intVar_03 == intVar_01)
  
      System.out.println("intVar_03(" + intVar_03 + ") == intVar_01(" + intVar_01 + ") = " + true);
  }
}