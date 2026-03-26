/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Random Number
 */
import java.util.*;
 
public class Example_108{

  public static void main(String [] args){

    // Random result of 1, 2, 3, 4, 5, or 6
    int var_01 = (int)(Math.random() * 6 + 1);
    int inputValue = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Try to match the value from 1 - 6");
    inputValue = input.nextInt();    

    if(inputValue == var_01){

      System.out.println("You are a winner!");
    }

    System.out.println("The random value was " + var_01);

    if(inputValue != var_01){

      System.out.println("Please try again.");
    }
  }
}