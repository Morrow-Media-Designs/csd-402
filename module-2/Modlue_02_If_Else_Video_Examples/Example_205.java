/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Errors - Why?
 */
public class Example_205{

  public static void main(String [] args){

    int localInt_01 = (int)(Math.random() * 6 + 1);
    int localInt_02 = (int)(Math.random() * 6 + 1);

    // What type of error
    if(localInt_01 == localInt_02)
      
      System.out.print("The values are ");
      System.out.println("equal");

    // What type of error
    else

      System.out.print("The values are not ");
      System.out.println("equal");

    // What type of error
    if(localInt_01 == localInt_02);
      
      System.out.print("The values are ");
      System.out.println("equal");

    // What type of error
    else;

      System.out.print("The values are not ");
      System.out.println("equal");
  }
}