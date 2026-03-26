/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implement an Interface
 */
public class Example_1_10 implements Auto{

  private boolean state = false;

  /*
   * Required
   */
  @Override
  public void start(){

    state = true;
  }

  /*
   * Required
   */
  @Override
  public void stop(){

    state = false;
  }

  /*
   * Required
   */
  @Override
  public boolean getState(){

    return state;
  }

  public static void main(String[] args){

    Example_1_10 c = new Example_1_10();
    System.out.println("Example_1_10 state is " + c.getState());
    c.start();
    System.out.println("Example_1_10 state is " + c.getState());
    c.stop();
    System.out.println("Example_1_10 state is " + c.getState());
  }
}

/*
 * Interface
 */
abstract interface Auto{

  /*
   * All the following are the same
   *
   * public abstract void start();
   * abstract void start();
   * public void start();
   * void start();
   *
   */
  void start();

  public abstract void stop();

  public abstract boolean getState();
}