/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * You may find yourself using this method more than expected.
 *
 * trim()
 */
public class Example_2_19{

  public static void main(String[] args){

    String s1 = new String("              Mad Magazine             ");

    System.out.println("-" + s1 + "-");

    System.out.println();

    System.out.println("-" + s1.trim() + "-");

    System.out.println();

    s1 = s1.trim();

    System.out.println("-" + s1 + "-");
  }
}