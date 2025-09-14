/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scanner class
 */
import java.util.*;
// or
// import java.util.Scanner;

public class Example_002{

  public static void main(String [] args){

    // Must hold a value before we can use it
    double height;
    double width;

    double area;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the height: ");
    height = input.nextDouble();    
    System.out.print("\nEnter the width: ");
    width = input.nextDouble();    

    area = height * width;

    System.out.println("\nThe area is " + area);
  }
}