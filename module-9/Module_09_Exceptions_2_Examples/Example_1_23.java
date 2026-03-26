/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Exceptions are declared, not handled
 * Method Declares Throwing a Super Class of Exceptions Thrown
 */
public class Example_1_23{

  public static void main(String[] args){

    Example_1_23 example = new Example_1_23();

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
      catch(Exception exception){

        System.out.println("Exception was caught");
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
  public void throwsException() throws Exception{

    switch((int)(Math.random() * 5)){

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

      case 4:
        System.out.println("Throw Exception");
        throw new Exception("Exception Exception");
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