/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Character Class
 *
 * isUpperCase()
 */
public class Example_2_01{

  public static void main(String [] args){

    Character CharObject1 = new Character('A');

    System.out.println(CharObject1.isUpperCase(CharObject1)); // True
    // A better option
    System.out.println(Character.isUpperCase(CharObject1)); // True
    // or
    System.out.println(Character.isUpperCase('A')); // True
    // Error
    // System.out.println(Character.isUpperCase("A"));

    System.out.println();

    System.out.println(Character.isUpperCase('A')); // True
    System.out.println(Character.isUpperCase('b')); // False
    System.out.println(Character.isUpperCase('@')); // False
    System.out.println(Character.isUpperCase('1')); // False
    System.out.println(Character.isUpperCase(';')); // False

    System.out.println();

    System.out.println(Character.isLowerCase('A')); // False
    System.out.println(Character.isLowerCase('b')); // True
    System.out.println(Character.isLowerCase('@')); // False
    System.out.println(Character.isLowerCase('1')); // False
    System.out.println(Character.isLowerCase(';')); // False

    System.out.println();

    System.out.println(Character.isDigit('A')); // False
    System.out.println(Character.isDigit('b')); // False
    System.out.println(Character.isDigit('@')); // False
    System.out.println(Character.isDigit('1')); // True
    System.out.println(Character.isDigit(';')); // False

    System.out.println();

    System.out.println(Character.isLetter('A')); // True
    System.out.println(Character.isLetter('b')); // True
    System.out.println(Character.isLetter('@')); // False
    System.out.println(Character.isLetter('1')); // False
    System.out.println(Character.isLetter(';')); // False

    System.out.println();

    System.out.println(Character.isLetterOrDigit('A')); // True
    System.out.println(Character.isLetterOrDigit('b')); // True
    System.out.println(Character.isLetterOrDigit('@')); // False
    System.out.println(Character.isLetterOrDigit('1')); // True
    System.out.println(Character.isLetterOrDigit(';')); // False

    System.out.println();
  
    // Error
    // System.out.println(Character.isWhitespace('')); // Error
    System.out.println(Character.isWhitespace(' ')); // True
    System.out.println(Character.isWhitespace('\t')); // True
    System.out.println(Character.isWhitespace('\n')); // True
    System.out.println(Character.isWhitespace('\b')); // False
    System.out.println(Character.isWhitespace('A')); // False
    System.out.println(Character.isWhitespace('3')); // False
  }
}