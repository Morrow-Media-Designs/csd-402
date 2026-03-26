/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 */
public class Example_2_02{

  public static void main(String [] args){

    Example_2_02 e2_02 = new Example_2_02();

    DataClass_02 data_01 = new DataClass_02();

    e2_02.printDataClass(data_01);

    e2_02.changeDataClass(data_01);
    
    e2_02.printDataClass(data_01);
  }

  public void changeDataClass(DataClass_02 data){

    //data = new DataClass_02();

    data.value_01 = 5;
    data.value_02 = 9;
  }

  public void printDataClass(DataClass_02 data){

    System.out.println("DataClass Output");
    System.out.println("Value_01 = " + data.value_01);
    System.out.println("Value_02 = " + data.value_02);
    System.out.println("DataClass Output");
  }
}

class DataClass_02{

  int value_01;
  int value_02;

  DataClass_02(){}

  DataClass_02(int param_01, int param_02){

    value_01 = param_01;
    value_02 = param_02;
  }
}