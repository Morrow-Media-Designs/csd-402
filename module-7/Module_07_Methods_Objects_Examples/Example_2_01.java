/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 */
public class Example_2_01{

  public static void main(String [] args){

    Example_2_01 e2_01 = new Example_2_01();

    DataClass_01 data_01 = new DataClass_01();
    DataClass_01 data_02 = new DataClass_01();

    e2_01.printDataClass(data_01);
    e2_01.printDataClass(data_02);
  }

  public void printDataClass(DataClass_01 data){

    System.out.println("DataClass Output");
    System.out.println("Value_01 = " + data.value_01);
    System.out.println("Value_02 = " + data.value_02);
    System.out.println("DataClass Output");
  }
}

class DataClass_01{

  int value_01;
  int value_02;

  DataClass_01(){}

  DataClass_01(int param_01, int param_02){

    value_01 = param_01;
    value_02 = param_02;
  }
}