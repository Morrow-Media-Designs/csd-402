/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Which of the following are correct?
 *
 * Two Format Ways
 */
public class Example_301{

  public static void main(String [] args){

    int localInt_01 = (int)(Math.random() * 2 + 1);
    int localInt_02 = (int)(Math.random() * 2 + 1);
    int localInt_03 = (int)(Math.random() * 2 + 1);

    System.out.println("localInt_01 = " + localInt_01);
    System.out.println("localInt_02 = " + localInt_02);
    System.out.println("localInt_03 = " + localInt_03);

    System.out.println();

    // Which of the following are correct?
    // Why?

    // Version 1 - Error
    if(localInt_01 == localInt_02)

      if(localInt_02 == localInt_03)

        System.out.println("All values are equal");

    else
 
      System.out.println("localInt_01 and localInt_02 are not equal");      

    System.out.println();

    // Version 2 - Correct
    if(localInt_01 == localInt_02)

      if(localInt_02 == localInt_03)

        System.out.println("All values are equal");

      else

        System.out.println("localInt_02 and localInt_03 are not equal");      
  }
}