/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * static final variables
 */
public class Example_3_03{

  public static void main(String [] args){

    DataClass_03 data_01 = new DataClass_03(2, 4, 6);

    data_01.printData();
    System.out.println(); 

    DataClass_03 data_02 = new DataClass_03(5, 6, 7);
    data_01.printData();
    data_02.printData();
    System.out.println(); 

    DataClass_03 data_03 = new DataClass_03(22, 33, 44);
    data_01.printData();
    data_02.printData();
    data_03.printData();
    System.out.println(); 
  }
}

class DataClass_03{

  final static int value_01 = 9;
  int value_02;
  int value_03;

  DataClass_03(int param_01, int param_02, int param_03){

    /*
     * Syntax error
     */
    // value_01 = param_01;
    value_02 = param_02;
    value_03 = param_03;
  }

  public void printData(){

    System.out.println("final static value_01 = " + value_01); 
    System.out.println("value_02 = " + value_02);
    System.out.println("value_03 = " + value_03);
  }
}