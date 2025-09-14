/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Reading from the Keyboard
 * nextDouble()
 */
import java.util.*;

public class Example_010{

  public static void main(String [] args){

    double testValue = 1000;
    double inputValue = 0;
    Scanner input = new Scanner(System.in);    

    System.out.println("Enter a real number between 1 and 99");
    inputValue = input.nextDouble();

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