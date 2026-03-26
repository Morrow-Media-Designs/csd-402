/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Exception Thrown
 *
 * MySecondBaseClassException extends Exception
 * MySecondSubClassException extends MySecondBaseClassException
 * "catch" correctly catches the appropriate Exception
 * Once an Exception is Thrown, the Block is Exited
 */
public class Example_1_10{

  public static void main(String[] args){

    for(int i = 0; i < 5; i++){

      try{

        switch((int)(Math.random() * 3)){
          case 0:
            throw new Exception();
            /*
             * May not have break here, it is unreachable
             * syntax error
             */
          case 1:
            throw new MySecondBaseClassException();
            /*
             * May not have break here, it is unreachable
             * syntax error
             */
          case 2:
            throw new MySecondSubClassException();
            /*
             * May not have break here, it is unreachable
             * syntax error
             */
        }
      }
      /*
       * Note the order in which the exception catch blocks are ordered.  
       * They must be from the most specific to the most general.
       */
      catch(MySecondSubClassException mssce){

        System.out.println("MySecondSubClassException has been thrown, caught, and handled.");
      }
      catch(MySecondBaseClassException msbse){

        System.out.println("MySecondBaseClassException has been thrown, caught, and handled.");
      }
      catch(Exception e){

        System.out.println("Exception has been thrown, caught, and handled.");
      }

      System.out.println();
    }
  }
}

class MySecondBaseClassException extends Exception{

  public MySecondBaseClassException(){

    super();
  }

  public MySecondBaseClassException(String s){

    super(s);
  }
}

class MySecondSubClassException extends MySecondBaseClassException{

  public MySecondSubClassException(){

    super();
  }

  public MySecondSubClassException(String s){

    super(s);
  }
}