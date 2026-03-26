/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Extend the Abstract Class Car3
 * Implement the Interface Auto2
 */
public class Example_1_13 extends Car3 implements Auto2{

  private boolean state = false;

  @Override
  public void start(){

    state = true;
  }

  @Override
  public void stop(){

    state = false;
  }

  @Override
  public boolean getState(){

    return state;
  }

  public static void main(String[] args){

    Example_1_13 ex = new Example_1_13();
    System.out.println("The Vet is " + ex.getSpeed());
    System.out.println("Vet state is " + ex.getState());
    ex.start();
    System.out.println("Vet state is " + ex.getState());
    ex.stop();
    System.out.println("Vet state is " + ex.getState());
  }
}

class Car3{

  public String speed = "Fast";

  public String getSpeed(){

    return speed;
  }
}

/*
 * abstract interface Auto2{
 */
interface Auto2{
/*
 * To be public must be in separate file
 * Leaving public off would cause default level access
 */

  /*
   * public abstract void start();
   * abstract void start();
   * public void start();
   * void start();
   */
  void start();

  /*
   * void start(){ // error
   *   speed = "Very Fast";
   * }
   */

  public abstract void stop();

  public abstract boolean getState();
}