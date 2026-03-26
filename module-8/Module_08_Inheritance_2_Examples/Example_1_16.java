/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Cannot Override a Final Method
 */
public class Example_1_16{

  public static void main(String [] args){

  }
}

class Animal_16{

  public final void printData(){

    System.out.println("Data");
  }

  // This method final
  // because it is private
  private void printData2(){

    System.out.println("Data");
  }
}

class Cat_16 extends Animal_16{

   // Error - Cannot override a final method
   /*
   @Override
   public void printData(){}
   */
   
  // Error - Cannot override a private method
  /*
  @Override
  public void printData2(){}
  */
}