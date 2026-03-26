/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * JOptionPane.showInputDialog
 *
 * Review
 */
import javax.swing.*;

public class Example_501{

  public static void main(String [] args){

    String input;

    input = JOptionPane.showInputDialog(null, "Enter a String to be displayed");

    JOptionPane.showMessageDialog(null, "The String entered is \"" + input + "\"");
  }
}