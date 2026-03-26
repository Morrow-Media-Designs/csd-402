/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Declaring Array Variables (References)
 *
 * No Arrays Created
 */

public class Example_001{

  public static void main(String[] args){

    // Allowed
    boolean booleanArray_01 [] = null;
    // Best
    boolean [] booleanArray_02 = null;

    // Allowed
    byte byteArray_01 [] = null;
    // Best
    byte [] byteArray_02 = null;

    // Allowed
    char charArray_01 [] = null;
    // Best
    char [] charArray_02 = null;

    // Allowed
    short shortArray_01 [] = null;
    // Best
    short [] shortArray_02 = null;

    int intArray_01 [] = null;
    // Best
    int [] intArray_02 = null;

    float floatArray_01 [] = null;
    // Best
    float [] floatArray_02 = null;

    double doubleArray_01 [] = null;
    // Best
    double [] doubleArray_02 = null;

    String stringArray_01 [] = null;
    // Best
    String [] stringArray_02 = null;

    // These lines will print null
    System.out.println("Boolean array = " + booleanArray_02);
    System.out.println("Byte array = " + byteArray_02);
    System.out.println("char array = " + charArray_02);
    System.out.println("Short array = " + shortArray_02);
    System.out.println("Integer array = " + intArray_02);
    System.out.println("Float array = " + floatArray_02);
    System.out.println("Double array = " + doubleArray_02);
    System.out.println("String array = " + stringArray_02);

    // Syntax Errors
    // char [6] cArray;
    // short [7] sArray;
    // int [7] iArray;
    // float [8] fArray;
    // double [8] dArray;
    // String [10] stringArray;
  }
}