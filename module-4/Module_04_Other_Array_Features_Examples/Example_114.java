/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Search for item using user input
 */
import javax.swing.*;

public class Example_114{

  public static void main(String[] args){

    String input = null;
    int itemToLookFor = 0;
    boolean found = false;

    int [] itemNumbers = {2,   4,   6,   8,   10};

    input = JOptionPane.showInputDialog(null, "Enter the item number you want the price for:");

    itemToLookFor = Integer.parseInt(input);

    for(int i = 0; i < itemNumbers.length; ++i){

      if(itemToLookFor == itemNumbers[i]){

        found = true;
     
      }
    }

    if(found){

      System.out.println("***** You item has been found. *****");
    }
    else{

      System.out.println("--- You item has not been found. ---");
    }
  }
}