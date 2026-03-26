/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 */
public class Example_2_03{

  public static void main(String [] args){

    Example_2_03 e2_03 = new Example_2_03();

    DataClass_03 data_01 = new DataClass_03();

    e2_03.printDataClass(data_01);

    e2_03.changeDataClass(data_01, 4, 5);
    
    e2_03.printDataClass(data_01);

    e2_03.changeDataClass(data_01, 88, 99);
    
    e2_03.printDataClass(data_01);
  }

  public void changeDataClass(DataClass_03 data){

    data.value_01 = 5;
    data.value_02 = 9;
  }

  public void changeDataClass(DataClass_03 data, int param_02, int param_03){

    data.value_01 = param_02;
    data.value_02 = param_03;
  }

  public void printDataClass(DataClass_03 data){

    System.out.println("DataClass Output");
    System.out.println("Value_01 = " + data.value_01);
    System.out.println("Value_02 = " + data.value_02);
    System.out.println("DataClass Output");
  }
}

class DataClass_03{

  int value_01;
  int value_02;

  DataClass_03(){}

  DataClass_03(int param_01, int param_02){

    value_01 = param_01;
    value_02 = param_02;
  }
}