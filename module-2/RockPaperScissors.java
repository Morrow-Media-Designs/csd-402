/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Resource for Math and Random: https://www.w3schools.com/js/js_random.asp
 * Resource for text formatting: https://www.w3schools.com/java/ref_string_format.asp
 * Resource for JOptionPane Dialong null: https://stackoverflow.com/questions/17264792/what-does-null-mean-as-parameter-in-joptionpane-showmessagedialog
 */
package com.example.CSD402.Module02;

import javax.swing.*; // Used for GUI Popup Input and Output Dialog

/*
* Student Justin Morrow | Date: 09/21/2025
* CSD-402 Module 2 Assignment 1: Rock Paper Scissors 
*/
public class RockPaperScissors {
    public static void main(String[] args) {
        
        //Computer Player random generator Rock (1), Paper (2), Scissors (3)
        int computerRandomChoice = (int)(Math.random() * 3) + 1;
                
        // Prompt the user to choose Rock (1), Paper (2) or Scissors (3)
        String userChoice = JOptionPane.showInputDialog(
            "Welcome to Rock-Paper-Scissors!\n\n" +
            "Enter your choice as seen below:\n\n" +
            "Rock: Press 1\n" +
            "Paper: Press 2\n" +
            "Scissors: Press 3\n\n"
        );
        
        // Converting string userChoice to integer named userChoiceInt
        int userChoiceInt = Integer.parseInt(userChoice);
        
        // GUI pop-up showing the user and computer choice selections
        JOptionPane.showMessageDialog(null,
                "Choices: Rock(1), Paper(2), Scissors(3)\n\n" +
                "You chose the number: " + userChoiceInt +
                "\nThe computer chose number: " + computerRandomChoice
        );
      
        // If and else if states to determine the winner
        // This option is a tie since the user and computer chose the same
        if (userChoiceInt == computerRandomChoice) {
            JOptionPane.showMessageDialog(null,
                "You both chose the same so it's a Tie"
            );
        }
        // The user wins since Rock(1) beats Scissors(3)
        else if (userChoiceInt == 1 && computerRandomChoice == 3) {
            JOptionPane.showMessageDialog(null,
                "Congratulations, You won since Rock beats Scissors!"
            );
        }
        // The user wins since Paper(2) beats Rock(1)
        else if (userChoiceInt == 2 && computerRandomChoice == 1) {
            JOptionPane.showMessageDialog(null,
                "Congratulations, You won since Paper beats Rock!"
            );
        }
        // The user wins since Scissors(3) beats Paper(2)
        else if (userChoiceInt == 3 && computerRandomChoice == 2) {
            JOptionPane.showMessageDialog(null,
                "Congratulations, You won since Scissors beats Paper!"
            );     
        }
        // The user didn't choose the winning selection so the computer wins
        else {
            JOptionPane.showMessageDialog(null,
                "Sorry, the computer won!");
        }
    }
}