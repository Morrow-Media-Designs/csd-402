/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Concatenation
 *
 * Using the + operator with String objects
 * Using the += operator with String objects
 */
public class Example_2_20{

  public static void main(String[] args){

    String s1 = new String("My First String ");
    String s2 = new String("My Second String ");
    String s3 = new String("My Third String");
    String s4;
    String s5;

    // Error - because s5 has no initial value
    // s5 += "Test";

    System.out.println("String object s1 = " + s1);
    System.out.println("String object s2 = " + s2);
    System.out.println("String object s3 = " + s3);

    /*
     * Here a new String object is created and s4 refers to that String
     */
    s4 = s1 + s2 + s3;
    /*
     * syntax error because String s5 has not been created yet
     * s5 += s3;
     */
    /*
     * Here a new String object is created and s5 refers to that String
     */
    s5 = s3 + "-" + s2;
    /*
     * Here a new String object is created and s2 refers to that String
     * s2 refers to a newly created String
     * If no references are left to the old s2 String it is marked for collection
     */
    s2 += s1;

    System.out.println("\n");
    System.out.println("String object s2 = " + s2);
    System.out.println("String object s4 = " + s4);
    System.out.println("String object s5 = " + s5);
  }
}