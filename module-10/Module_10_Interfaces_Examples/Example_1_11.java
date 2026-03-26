/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implement Multiple Interfaces
 */
public class Example_1_11 extends Implement1a implements Interface2{

  public void m2(){

    System.out.println("m2");
  }

  public static void main(String[] args){

    Example_1_11 ex = new Example_1_11();
    ex.m1();
    ex.m2();
  }
}

class Implement1a implements Interface1{

  @Override
  public void m1(){

    System.out.println("m1");
  }
}

interface Interface1{

  public abstract void m1();
}

interface Interface2{

  public abstract void m2();
}