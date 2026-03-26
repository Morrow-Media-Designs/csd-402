/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Immutable Object
 */
public class Example_3_01{

  public static void main(String [] args){

    ImmutableClass_01 immutable_01 = new ImmutableClass_01();
    ImmutableClass_01 immutable_02 = new ImmutableClass_01(4, 5);
    ImmutableClass_01 immutable_03 = new ImmutableClass_01(77, 88);

    System.out.println("immutable_01.getData_01() = " + immutable_01.getData_01());
    System.out.println("immutable_02.getData_01() = " + immutable_02.getData_01());
    System.out.println("immutable_03.getData_01() = " + immutable_03.getData_01());

    System.out.println("-------------------------");

    System.out.println("immutable_01.getData_02() = " + immutable_01.getData_02());
    System.out.println("immutable_02.getData_02() = " + immutable_02.getData_02());
    System.out.println("immutable_03.getData_02() = " + immutable_03.getData_02());

    System.out.println("-------------------------");
    System.out.println("        Errors");
    System.out.println("-------------------------");

    // private
    // immutable_01.data_01 = 9;
    // immutable_01.data_02 = 7;
    // immutable_02.data_01 = 5;
    // immutable_02.data_02 = 4;
    // immutable_03.data_01 = 2;
    // immutable_03.data_02 = 1;

    // No setters
    // immutable_01.setData_01(6);
    // immutable_01.setData_02(7);
    // immutable_02.setData_01(8);
    // immutable_02.setData_02(9);
    // immutable_03.setData_01(1);
    // immutable_03.setData_02(2);
  }
}

class ImmutableClass_01{

  private int data_01;
  private int data_02;

  public ImmutableClass_01(){
  
  }

  public ImmutableClass_01(int param_01, int param_02){

    data_01 = param_01;
    data_02 = param_02;
  }

  public int getData_01(){
 
    return data_01;
  }

  public int getData_02(){
 
    return data_02;
  }
}