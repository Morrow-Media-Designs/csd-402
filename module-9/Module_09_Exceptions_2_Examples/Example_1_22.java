/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Exceptions are declared, not handled
 * Method Declares Throwing a Super Class of Exceptions Thrown
 */
public class Example_1_22{

  public static void main(String[] args){

    Example_1_22 example = new Example_1_22();

    for(int i = 0; i < 6; i++){

      System.out.println();

      try{

        example.throwsException();
      }
      catch(SubOneException exception){

        System.out.println("SubOneException was caught.");
      }
      catch(SubTwoException exception){

        System.out.println("SubTwoException was caught.");
      }
      catch(SubThreeException exception){

        System.out.println("SubThreeException was caught.");
      }
      catch(SuperException exception){

        System.out.println("SuperException was caught");
      }
    }
  }

  /*
   * My throw
   *
   * SubOneException or
   * SubTwoException or
   * SubThreeException or
   * SuperException
   */
  public void throwsException() throws SuperException{

    switch((int)(Math.random() * 4)){

      case 0:
        System.out.println("Throw SubOneException");
        throw new SubOneException();

      case 1:
        System.out.println("Throw SubTwoException");
        throw new SubTwoException();

      case 2:
        System.out.println("Throw SubThreeException");
        throw new SubThreeException();

      case 3:
        System.out.println("Throw SuperException");
        throw new SuperException();
    }
  }
}

class SuperException extends Exception{

  public SuperException(){

    super();
  }

  public SuperException(String s){

    super(s);
  }
}

class SubOneException extends SuperException{

  public SubOneException(){

    super();
  }

  public SubOneException(String s){

    super(s);
  }
}

class SubTwoException extends SuperException{

  public SubTwoException(){

    super();
  }

  public SubTwoException(String s){

    super(s);
  }
}

class SubThreeException extends SuperException{

  public SubThreeException(){

    super();
  }

  public SubThreeException(String s){

    super(s);
  }
}