/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * String methods
 *
 * indexOf() and lastIndexOf()
 */
public class Example_2_15{

  public static void main(String[] args){

    String lookFor1 = new String("for");
    String lookFor2 = new String("the");
    String lookFor3 = new String("The");
    String lookFor4 = new String("(");
    String lookFor5 = new String(")");
    String lookFor6 = new String("UTF-16");

    //                                                        34
    String s1 = new String("The class String includes methods for examining " +
       "individual characters of the sequence, " +
       "for comparing strings, for searching strings, for extracting substrings, and for creating " +
       "a copy of a string with all characters translated to uppercase or to lowercase. " +
       "Case mapping is based on the Unicode Standard version specified by the Character class. " +
       "The Java language provides special support for the string concatenation operator ( + ), " +
       "and for conversion of other objects to strings. String concatenation is implemented " +
       "through the StringBuilder(or StringBuffer) class and its append method. String " +
       "conversions are implemented through the method toString, defined by Object and " +
       "inherited by all classes in Java. For additional information on string concatenation " +
       "and conversion, see Gosling, Joy, and Steele, The Java Language Specification. " +
       "Unless otherwise noted, passing a null argument to a constructor or method in this " +
       "class will cause a NullPointerException to be thrown. " +
       "A String represents a string in the UTF-16 format in which supplementary " +
       "characters are represented by surrogate pairs (see the section Unicode Character " +
       "Representations in the Character class for more information). Index values refer " +
       "to char code units, so a supplementary character uses two positions in a String. " +
       "The String class provides methods for dealing with Unicode code points " +
       "(i.e., characters), in addition to those for dealing with Unicode code units " +
       "(i.e., char values). ");

     System.out.println("The first s1.indexOf(\"and\") " + s1.indexOf("class")); // 4
     System.out.println("The first s1.indexOf(\"in\") " + s1.indexOf("in")); // Found in the word String 13
     System.out.println("The last s1.lastIndexOf(\"and\") " + s1.lastIndexOf("and")); // lastIndexOf() 794
     System.out.println("The last s1.lastIndexOf(\"in\")" + s1.lastIndexOf("in")); // lastIndexOf() 1412

     System.out.println();

     System.out.println("The first s1.indexOf(\"" + lookFor1 + "\") " + s1.indexOf(lookFor1)); // 34
     System.out.println("The first s1.indexOf(\"" + lookFor2 + "\") " + s1.indexOf(lookFor2)); // 73
     System.out.println("The first s1.indexOf(\"" + lookFor3 + "\") " + s1.indexOf(lookFor3)); // 0

     System.out.println();

     System.out.println("The last s1.lastIndexOf(\"" + lookFor1 + "\") " + s1.lastIndexOf(lookFor1)); // 1404
     System.out.println("The last s1.lastIndexOf(\"" + lookFor2 + "\") " + s1.lastIndexOf(lookFor2)); // 1149
     System.out.println("The last s1.lastIndexOf(\"" + lookFor3 + "\") " + s1.lastIndexOf(lookFor3)); // 1292
  }
}