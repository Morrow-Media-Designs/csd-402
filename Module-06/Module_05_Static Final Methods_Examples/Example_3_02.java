/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * final variables
 */
public class Example_3_02{

  public static void main(String [] args){

    DataClass_02 data_01 = new DataClass_02(2, 4, 6);


    data_01.printData();
    System.out.println(); 

    /*
     * Syntax error
     */
    // data_01.value_01 = 4;

    data_01.printData();
    System.out.println(); 
  }
}

class DataClass_02{

  /*
   * final
   */
  final int value_01;
  int value_02;
  int value_03;

  DataClass_02(int param_01, int param_02, int param_03){

    value_01 = param_01;
    value_02 = param_02;
    value_03 = param_03;
  }

  public void printData(){

    System.out.println("static value_01 = " + value_01); 
    System.out.println("value_02 = " + value_02);
    System.out.println("value_03 = " + value_03);
  }
}