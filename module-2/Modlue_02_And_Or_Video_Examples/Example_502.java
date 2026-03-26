/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * JOptionPane.showConfirmDialog
 */
import javax.swing.*;

public class Example_502{

  public static void main(String [] args){

    int selection;
    boolean isYes = false;

    // JOptionPane Example 1
    selection = JOptionPane.showConfirmDialog(null, "Do you like to watch sports?");

    if(selection == JOptionPane.YES_OPTION){

      JOptionPane.showMessageDialog(null, "You answered \"Yes\"");
    }

    if(selection == JOptionPane.NO_OPTION){

      JOptionPane.showMessageDialog(null, "You answered \"No\"");
    }

    if(selection == JOptionPane.CANCEL_OPTION){

      JOptionPane.showMessageDialog(null, "You answered \"Cancel\"");
    }

    // JOptionPane Example 2
    selection = JOptionPane.showConfirmDialog(null, "Choose one", "Yes/No", JOptionPane.YES_NO_OPTION);

    if(selection == JOptionPane.YES_OPTION){

      JOptionPane.showMessageDialog(null, "You answered \"Yes\"");
    }

    if(selection == JOptionPane.NO_OPTION){

      JOptionPane.showMessageDialog(null, "You answered \"No\"");
    }
  }
}