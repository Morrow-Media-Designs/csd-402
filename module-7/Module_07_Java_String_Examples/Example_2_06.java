/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Strings Are Immutable
 * They cannot be changed
 */
public class Example_2_06{

  public static void main(String[] args){

    String s1 = "First String";
    // or
    // String s1 = new String("First String");

    // First String
    System.out.println(s1);

    changeString1(s1);

    // First String
    System.out.println(s1);

    // The return is ignored
    changeString2(s1);

    // First String
    System.out.println(s1);

    s1 = changeString2(s1);

    // New String 2
    System.out.println(s1);
  }

  // The String parameter passed to this method is not changed
  public static void changeString1(String s){

    s = "New String 1";

    System.out.println("\t\ts = " + s);
  }

  // The String parameter passed to this method is not changed
  public static String changeString2(String s){

    s = "New String 2";

    System.out.println("\t\ts = " + s);

    return s;
  }
}