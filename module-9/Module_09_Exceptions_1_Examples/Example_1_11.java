/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Syntax Error
 * Will not compile - why?
 *
 * Exception thrown
 * MyThirdBaseClassException extends Exception
 * MyThirdSubClassException extends MyThirdBaseClassException
 *
 * Must Catch in Order of Most Specific to Most General
 */
public class Example_1_11{

  public static void main(String[] args){

    for(int i = 0; i < 5; i++){

      try{

        switch((int)(Math.random() * 3)){
          case 0:
            throw new Exception();
            /*
             * May not have break here, it is unreachable
             * Syntax error
             */
          case 1:
            throw new MyThirdBaseClassException();
            /*
             * May not have break here, it is unreachable
             * Syntax error
             */
          case 2:
            throw new MyThirdSubClassException();
            /*
             * May not have break here, it is unreachable
             * Syntax error
             */
        }
      }
      catch(Exception e){

        System.out.println("Exception has been thrown, caught, and handled.");
      }
      catch(MyThirdBaseClassException mtbce){

        System.out.println("MyThirdBaseClassException has been thrown, caught, and handled.");
      }
      catch(MyThirdSubClassException mtsce){

        System.out.println("MyThirdSubClassException has been thrown, caught, and handled.");
      }
      System.out.println();
    }
  }
}

class MyThirdBaseClassException extends Exception{

  public MyThirdBaseClassException(){

    super();
  }

  public MyThirdBaseClassException(String s){

    super(s);
  }
}

class MyThirdSubClassException extends MyThirdBaseClassException{

  public MyThirdSubClassException(){

    super();
  }

  public MyThirdSubClassException(String s){

    super(s);
  }
}