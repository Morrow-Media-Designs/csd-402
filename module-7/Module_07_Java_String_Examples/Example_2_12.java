/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Error
 *
 */
public class Example_2_12{

  public static void main(String[] args){

    String s1 = new String("Test Test Test");

    try{
      // = is the error
      for(int i = 0; i <= s1.length(); ++i){

        System.out.println(s1.charAt(i));
      }
    }
    catch(StringIndexOutOfBoundsException sioobe){

      System.out.println(sioobe);
    }
  }
}