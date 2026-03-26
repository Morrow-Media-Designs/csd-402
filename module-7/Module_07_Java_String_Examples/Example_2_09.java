/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * equalsIgnoreCase() - Example 2
 */
public class Example_2_09{

  public static void main(String[] args){

    String s1 = new String("TEST");
    String s2 = new String("test");

    if( "Test".equalsIgnoreCase("Test") ){ // True
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }

    if( s1.equalsIgnoreCase("Test") ){ // True
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }

    if( "Test".equalsIgnoreCase(s2) ){ // True
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}