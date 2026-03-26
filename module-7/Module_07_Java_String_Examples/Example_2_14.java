/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Demonstrate String methods
 * toLowerCase() and toUpperCase()
 */
public class Example_2_14{

  public static void main(String[] args){

    String s1 = "What Me Worry. ";

    System.out.println("s1.toLowerCase() = \"" + s1.toLowerCase() + "\"");
    /*
     * Note: no change to s1
     */
    System.out.println("s1 = " + s1);

    System.out.println();


    System.out.println("s1.toUpperCase() = \"" + s1.toUpperCase() + "\"");
    /*
     * Note: no change to s1
     */
    System.out.println("s1 = " + s1);

    System.out.println();


    s1 = s1.toLowerCase();
    /*
     * Note: change to s1
     * Change (new String) is assigned to s1
     */
    System.out.println("s1 = " + s1);

    System.out.println();

    s1 = s1.toUpperCase();
    /*
     * Note: change to s1
     * Change (new String) is assigned to s1
     */
    System.out.println("s1 = " + s1);

    System.out.println();
  }
}