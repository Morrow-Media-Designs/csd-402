/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Runtime Exception - Unchecked Exception
 *
 * ArithmeticException
 */
public class Example_1_02{

  public static void main(String[] args){

    for(int i = 0; i < 10; i++){

      /*
       * Throws an exception if the second operand is 0
       */
      System.out.println(5 / (int)(Math.random() * 7));
    }
  }
}