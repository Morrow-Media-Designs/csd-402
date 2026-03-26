/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Character Class Methods
 */

public class Example_103{

  public static void main(String [] args){

    char char_01 = '\u0041'; // A
    char char_02 = '\u0025'; // %
    char char_03 = '\u0032'; // 2
    char char_04 = '\u0040'; // @
 
    System.out.println("-----------------------------------------------");
    System.out.println(char_01);
    System.out.println("isDigit " + Character.isDigit(char_01));
    System.out.println("isLetter " + Character.isLetter(char_01));
    System.out.println("isLowerCase " + Character.isLowerCase(char_01));
    System.out.println("isUpperCase " + Character.isUpperCase(char_01));
    System.out.println("toLowerCase " + Character.toLowerCase(char_01));
    System.out.println("toUpperCase " + Character.toUpperCase(char_01));
    // No change to the variable
    System.out.println(char_01);
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
    System.out.println(char_02);
    System.out.println("isDigit " + Character.isDigit(char_02));
    System.out.println("isLetter " + Character.isLetter(char_02));
    System.out.println("isLowerCase " + Character.isLowerCase(char_02));
    System.out.println("isUpperCase " + Character.isUpperCase(char_02));
    System.out.println("toLowerCase " + Character.toLowerCase(char_02));
    System.out.println("toUpperCase " + Character.toUpperCase(char_02));
    // No change to the variable
    System.out.println(char_02);
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
    System.out.println(char_03);
    System.out.println("isDigit " + Character.isDigit(char_03));
    System.out.println("isLetter " + Character.isLetter(char_03));
    System.out.println("isLowerCase " + Character.isLowerCase(char_03));
    System.out.println("isUpperCase " + Character.isUpperCase(char_03));
    System.out.println("toLowerCase " + Character.toLowerCase(char_03));
    System.out.println("toUpperCase " + Character.toUpperCase(char_03));
    // No change to the variable
    System.out.println(char_03);
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
    System.out.println(char_04);
    System.out.println("isDigit " + Character.isDigit(char_04));
    System.out.println("isLetter " + Character.isLetter(char_04));
    System.out.println("isLowerCase " + Character.isLowerCase(char_04));
    System.out.println("isUpperCase " + Character.isUpperCase(char_04));
    System.out.println("toLowerCase " + Character.toLowerCase(char_04));
    System.out.println("toUpperCase " + Character.toUpperCase(char_04));
    // No change to the variable
    System.out.println(char_04);
    System.out.println("-----------------------------------------------");
  }
}