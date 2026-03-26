/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Error - Why?
 *
 * Scope
 */
public class Example_206{

  public static void main(String [] args){

    int localInt_01 = (int)(Math.random() * 6 + 1);
    int localInt_02 = (int)(Math.random() * 6 + 1);

    // What type of error
    if(localInt_01 == localInt_02){

      boolean results = true;
      
      System.out.println(results);
    }
    // What type of error
    else{

      System.out.println(results);
    }
  }
}