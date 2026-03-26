/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * this reference
 */
public class Example_3_03{

  public static void main(String [] args){

    ThisClass thisClass = new ThisClass();

    thisClass.classScopeVar = 3;

    // Not valid
    // this.classScopeVar = 3;
  }
}

class ThisClass{

  int classScopeVar = 9;

  public void thisClass_01(){

    int methodScope_01 = 9;

    // valid
    this.classScopeVar = 9;

    // Not valid
    // this.methodScope_01 = 9;
  }
}