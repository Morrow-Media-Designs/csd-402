/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 */
public class Example_2_04{

  public static void main(String [] args){

    Example_2_04 e2_04 = new Example_2_04();

    DataClass_04 data_04[] = new DataClass_04[5];

    for(int i = 0; i < data_04.length; ++i){
   
      data_04[i] = new DataClass_04(i * 2, i * 3);
    }

    for(int i = 0; i < data_04.length; ++i){
   
      e2_04.printDataClass(data_04[i]);
    }   
  }

  public void changeDataClass(DataClass_04 data){

    data.value_01 = 5;
    data.value_02 = 9;
  }

  public void changeDataClass(DataClass_04 data, int param_02, int param_03){

    data.value_01 = param_02;
    data.value_02 = param_03;
  }

  public void printDataClass(DataClass_04 data){

    System.out.println("DataClass Output");
    System.out.println("Value_01 = " + data.value_01);
    System.out.println("Value_02 = " + data.value_02);
    System.out.println("DataClass Output");
  }
}

class DataClass_04{

  int value_01;
  int value_02;

  DataClass_04(){}

  DataClass_04(int param_01, int param_02){

    value_01 = param_01;
    value_02 = param_02;
  }
}