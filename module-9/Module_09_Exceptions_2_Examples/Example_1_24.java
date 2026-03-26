/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Exceptions Declared and Not Handled
 */
public class Example_1_24{

  public static void main(String[] args){

    Example_1_24 example = new Example_1_24();

    for(int i = 0; i < 6; i++){

      try{

        example.throwsException();
      }
      /*
       * Exceptions are handled here
       */
      catch(NumberOneException noe){

        System.out.println("NumberOneException was thrown.");
      }
      catch(NumberTwoException nte){

        System.out.println("NumberTwoException was thrown.");
      }
      catch(NumberThreeException nte){

        System.out.println("NumberThreeException was thrown.");
      }
      catch(Exception e){

        System.out.println("I have no idea what is going on.");
      }
    }
  }

  /*
   * Exceptions are declared here and not handled
   */
  public void throwsException() throws NumberOneException, NumberTwoException, NumberThreeException{

    switch((int)(Math.random() * 3)){

      case 0:
        throw new NumberOneException();
        // break; In this example, this code is unreachable 
      case 1:
        throw new NumberTwoException();

      case 2:
        throw new NumberThreeException();
    }
  }
}

class NumberOneException extends Exception{

  public NumberOneException(){

    super();
  }

  public NumberOneException(String s){

    super(s);
  }
}

class NumberTwoException extends Exception{

  public NumberTwoException(){

    super();
  }

  public NumberTwoException(String s){

    super(s);
  }
}

class NumberThreeException extends Exception{

  public NumberThreeException(){

    super();
  }

  public NumberThreeException(String s){

    super(s);
  }
}