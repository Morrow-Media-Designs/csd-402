/*
 *
 * Professor Darrell Payne
 * Example_991.java
 *
 * printf()
 *
 * Some Format Specifiers
 * %d Decimal
 * %f Fixed Floating Point
 * %s String
 * %c Character
 * %% % Symbol
 * %n Newline
 */
public class Example_101{

  public static void main(String [] args){

    System.out.println("----------------------------------------------------------");
    System.out.printf("%s\t%s\n\n", "Hello World!", "Welcome to Java");
    System.out.println("----------------------------------------------------------");
    System.out.printf("%s\n\n%s\n\n", "Hello World!", "Welcome to Java");
    System.out.println("----------------------------------------------------------");
    System.out.printf("%s%n%n%s%n%n", "Hello World!", "Welcome to Java");
    System.out.println("----------------------------------------------------------");
  }
}