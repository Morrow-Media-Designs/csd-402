/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Logic Error - No {}s
 */
public class Example_111{

  public static void main(String [] args){

    int intVar_01 = 9;
    int intVar_02 = 0;
    int intVar_03 = 9;

    // What is the result of this code?
    if(intVar_01 == intVar_02)
  
      System.out.print("intVar_01(" + intVar_01 + ") == intVar_02(" + intVar_02 + ") = ");
      System.out.println(true);

    // What is the result of this code?
    if(intVar_02 == intVar_03)
  
      System.out.print("intVar_02(" + intVar_02 + ") == intVar_03(" + intVar_03 + ") = ");
      System.out.println(true);

    // What is the result of this code?
    if(intVar_03 == intVar_01)
  
      System.out.print("intVar_03(" + intVar_03 + ") == intVar_01(" + intVar_01 + ") = ");
      System.out.println(true);
  }
}