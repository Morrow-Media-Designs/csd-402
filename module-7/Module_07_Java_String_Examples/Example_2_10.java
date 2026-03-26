/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * compareTo(String)
 * Compares two strings lexicographically.
 *
 * lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order) 
 */
public class Example_2_10{

  public static void main(String[] args){

    String s1 = new String("ABC");
    String s2 = new String("DEF");
    String s3 = new String("XYZ");
    String s4 = new String("ABC");
    String s5 = new String("ABD");

    // ABC - DEF
    System.out.println(s1 + ".compareTo(" + s2 + ") = " + s1.compareTo(s2)); // -3
    System.out.println(s2 + ".compareTo(" + s1 + ") = " + s2.compareTo(s1)); // 3

    System.out.println();

    // DEF - XYZ
    System.out.println(s2 + ".compareTo(" + s3 + ") = " + s2.compareTo(s3)); // -20
    System.out.println(s3 + ".compareTo(" + s2 + ") = " + s3.compareTo(s2)); // 20

    System.out.println();

    // ABC - XYZ
    System.out.println(s1 + ".compareTo(" + s3 + ") = " + s1.compareTo(s3)); // -23
    System.out.println(s3 + ".compareTo(" + s1 + ") = " + s3.compareTo(s1)); // 23

    System.out.println();

    // ABC - ABC
    System.out.println(s1 + ".compareTo(" + s4 + ") = " + s1.compareTo(s4)); // 0
    System.out.println(s4 + ".compareTo(" + s1 + ") = " + s4.compareTo(s1)); // 0

    System.out.println();

    // ABC - ABD
    System.out.println(s4 + ".compareTo(" + s5 + ") = " + s4.compareTo(s5)); // -1
    System.out.println(s5 + ".compareTo(" + s4 + ") = " + s5.compareTo(s4)); // 1
  }
}