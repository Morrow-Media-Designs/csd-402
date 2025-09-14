/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Reading from the Keyboard
 * nextInt()
 */
import java.util.*;

public class Example_009{

  public static void main(String [] args){

    int testValue = 1000;
    int inputValue = 0;
    Scanner input = new Scanner(System.in);    

    System.out.println("Enter a whole number between 1 and 99");
    inputValue = input.nextInt();

    System.out.print(testValue + " + " + inputValue + " = ");
    System.out.println(testValue + inputValue);

    System.out.print(testValue + " - " + inputValue + " = ");
    System.out.println(testValue - inputValue);

    System.out.print(testValue + " * " + inputValue + " = ");
    System.out.println(testValue * inputValue);

    System.out.print(testValue + " / " + inputValue + " = ");
    System.out.println(testValue / inputValue);

    System.out.print(testValue + " % " + inputValue + " = ");
    System.out.println(testValue % inputValue);
  }
}