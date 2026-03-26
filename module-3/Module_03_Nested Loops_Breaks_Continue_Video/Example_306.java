/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Control Loop with "ConfirmDialog"
 */
import javax.swing.*;

public class Example_306{

  public static void main(String [] args){

    while(true){

      // If "Yes"
      if(JOptionPane.showConfirmDialog(null, "Continue?") == JOptionPane.YES_OPTION){

        JOptionPane.showMessageDialog(null, "This program will continue...");
      }
      // If not "Yes", "No" or "Cancel"
      else{

        JOptionPane.showMessageDialog(null, "This program will end.");
        break;
      }
    }
  }
}