/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implement Multiple Interfaces
 */
public class Example_1_12 implements Interface3, Interface4{

  @Override
  public void m3(){

    System.out.println("m3");
  }

  @Override
  public void m4(){

    System.out.println("m4");
  }

  public static void main(String[] args){

    Example_1_12 ex = new Example_1_12();
    ex.m3();
    ex.m4();
  }
}

interface Interface3{

  public abstract void m3();
}

interface Interface4{

  public abstract void m4();
}