/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * This is a bad example, something we should never use
 *
 * This example demonstrates all sections of a for loop are optional
 *
 */
public class Example_202{

  public static void main(String [] args){

    // initial-action
    int i = 0;

    for( ; ; ){

      System.out.println("The value of \"i\" is " + i);

      // action-after-each-iteration
      ++i;

      // loop-continuation-condition
      if(i == 10){

        break;
      }
    }

    System.out.println();
    // or

    // initial-action
    i = 0;

    for( ; true ; ){

      System.out.println("The value of \"i\" is " + i);

      // action-after-each-iteration
      ++i;

      // loop-continuation-condition
      if(i == 10){

        break;
      }
    }
  }
}