/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Are These Methods Overloaded?
 *
 * Holds Error Examples
 *
 * Implicit Conversion, Implicit Cast?
 *
 */
public class Example_003{

  public static void main(String [] args){

    Example_003.printParam_1(52);
    Example_003.printParam_2(52.00);
    Example_003.printParam_1(98);
    Example_003.printParam_2(98.00);

    System.out.println();

    // Error - Why
    // Example_003.printParam_1(52.00);
   
    // Valid - Why?
    // Implicit widening
    // Example_003.printParam_2(52);

    // Error - Why?
    // Example_003.printParam_1(98.00);

    // Valid - Why?
    // Implicit widening
    // Example_003.printParam_2(98);
  }

  public static void printParam_1(int param_01){

    System.out.println("int value = " + param_01);
  }

  public static void printParam_2(double param_01){

    System.out.println("double value = " + param_01);
  }
}