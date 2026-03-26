/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Variable Scope
 */
public class Example_3_02{

  public static void main(String [] args){

  }
}

class DataClass_01{

  // Class scope
  int classScopeVar = 9;

  // Not valid
  // methodScope_01 = 8;
  // methodScope_02 = 2;

  public void classMethod_01(){

    int methodScope_01 = 9;

    // Valid
    classScopeVar = 3;
    methodScope_01 = 5;

    // Not valid
    // methodScope_02 = 3;
  }

  public void classMethod_02(){

    int methodScope_02 = 9;

    // Valid
    classScopeVar = 34;

    // Not valid
    // methodScope_01 = 99;
  }
}