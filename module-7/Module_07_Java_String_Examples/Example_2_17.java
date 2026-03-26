/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Some String methods
 *
 * replace(char, char)
 */
public class Example_2_17{

  public static void main(String[] args){

    char lower[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
    char upper[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-'};

    String s1 = new String("The class String includes methods for examining individual characters of the sequence, " +
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

    for(int i = 0; i < lower.length; ++i){

      // A good example as to why we should use StringBuilder and StringBuffer
      s1 = s1.replace(lower[i], upper[i]);
    }

    System.out.println(s1);
  }
}