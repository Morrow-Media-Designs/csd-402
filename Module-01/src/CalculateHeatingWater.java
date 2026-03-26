/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Strings take inputs, double converts strings to integers/numbers for calculating
 * https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
 */
package com.example.CSD402.Project01;

import javax.swing.*; // Used for GUI Popup Input and Output Dialog

/*
* Student Justin Morrow | Date: 09/13/2025
* CSD-402 Module 1 Assignment 2: Calculate Energy needed to heat water 
*/
public class CalculateHeatingWater {
    public static void main(String[] args) {
        
        // Prompt the user to enter the amount of water in kilograms
        String waterMassInput = JOptionPane.showInputDialog("Please enter the amount of water to heat (kilograms):");
        double waterMass = Double.parseDouble(waterMassInput);
        
        // Prompt the user for the starting temperature of the water
        String initialTemperatureInput = JOptionPane.showInputDialog("Enter the beginning water temperature (Celcius):");
        double initialTemperature = Double.parseDouble(initialTemperatureInput);
        
        // Prompt the user for the desired ending temperature to heat the water to
        String finalTemperatureInput = JOptionPane.showInputDialog("Enter the temperature you want to heat the water to (Celcius):");
        double finalTemperature = Double.parseDouble(finalTemperatureInput);
        
        // Calculate the energy in joules needed to heat the water
        double Q = (waterMass* (finalTemperature - initialTemperature)* 4184);
        
        // Format 2 decimal places since my displayed values were very long
        String Q2Dec = String.format("%.2f", Q);

        // Display the calculated results in a dialog box pop-up GUI
        JOptionPane.showMessageDialog(null, "Total energy needed to heat the water to from " + initialTemperature + " to " + finalTemperature + " in Celcius is: " + Q2Dec + " Joules.");
    }
}

