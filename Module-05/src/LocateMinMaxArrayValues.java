/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CSD402.Module05;


/*  Student Justin Morrow | Date: 10/12/2025
    CSD-402 Module 5 Assignment 1 (Return the Location of the Largest/Smallest Elements in a 2D Array)
    Example 104's code provided by Professor Darrell Payne was used to setup the structure of using
    separate methods for createArray(), fillArray(), printArray() with nested for-loops and  
    2D Arrays that are indexed by [i] and [j].
    These Arrays are 0 based and start top/down and then left/right.
    Reference: [1][1] is middle the row middle and middle column in a 3x3 grid
    Online Resource: https://www.geeksforgeeks.org/java/java-program-to-find-the-maximum-element-in-a-matrix/
*/


public class LocateMinMaxArrayValues {

    public static void main(String[] args) {

        // Creates an empty Array with 3 Rows and 3 Columns called mod5Array
        int[][] mod5Array = createArray(3, 3);

        // Calls the fillArray/printArray Modules and Prints the Auto-Filled Array Values
        fillArray(mod5Array);
        System.out.println("\nThe Auto-Filled Array Values are:");
        printArray(mod5Array);

        // Finds the Position of the Row/Column for the Largest/Smallest Values in the Array   
        int[] largestPosition = locateLargest(mod5Array);
        int[] smallestPosition = locateSmallest(mod5Array);

        // Finds the Largest/Smallest Numbers
        int largestValue = mod5Array[largestPosition[0]][largestPosition[1]];
        int smallestValue = mod5Array[smallestPosition[0]][smallestPosition[1]];
        
        // Print to screen the results of the Largest/Smallest Numbers in the Array and their Position [row][column]
        System.out.println("\nThe Largest Number in the Array is " + largestValue + " at position: [" + largestPosition[0] + "][" + largestPosition[1] + "]");
        System.out.println("\nThe Smallest Number in the Array is " + smallestValue + " at position: [" + smallestPosition[0] + "][" + smallestPosition[1] + "]");
        System.out.println("\nThis completes the program!");
    }

    
    // Creating the Empty 2D Array as seen in Example_104's createArray()
    public static int[][] createArray(int rows, int cols) {
        return new int[rows][cols];
    }

    
    // Fill Array Module seen in Example_104's fillArray() with random 2-digit numbers
    public static void fillArray(int[][] arrayParam) {
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                arrayParam[i][j] = (int)(Math.random() * 90 + 10);
            }
        }
    }

    
    // Print Array Module as seen in Example_104's printArray()
    public static void printArray(int[][] arrayParam) {
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + "  ");
            }
            System.out.println();
        }
    }

    
    /*  Write methods using the following headers that returns the location of 
        the largest element in the array passed to the method returning a one-dimensional 
        array that contains two location elements
    */
    public static int[] locateLargest(int[][] arrayParam) {
        
        // Initialize the variables to store the row/column of the largest value
        int maxRow = 0, maxColumn = 0;
        int maxValue = arrayParam[0][0];

        // Nested loop for Comparison as Seen in Example_104
        // Outer loop to iterate through each row [i]        
        for (int i = 0; i < arrayParam.length; i++) {
            // Inner loop to iterate through each column [j] in the row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Check if the current value is smaller than the smallest value 
                if (arrayParam[i][j] > maxValue) {
                    // If value is now the largest value update maxValue and the references of [maxRow] and [maxColumn]
                    maxValue = arrayParam[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
       
        // Returns a 1-D Array formatted as [row, column] of the largest value
        return new int[]{maxRow, maxColumn};
    }

    
    /*  Write methods using the following headers that returns the location of 
        the smallest element in the array passed to the method returning a 
        one-dimensional array that contains two location elements
    */
    public static int[] locateSmallest(int[][] arrayParam) {
        
        // Initialize the variables to store the row/column of the smallest value
        int minRow = 0, minColumn = 0;
        
        // Start comparing with the value against the number at position [0][0]
        int minValue = arrayParam[0][0];

        // Nested loop for Comparison as Seen in Example_104
        // Outer loop to iterate through each row [i]
        for (int i = 0; i < arrayParam.length; i++) {
            // Inner loop to iterate through each column [j] in the row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Check if the current value is smaller than the smallest value 
                if (arrayParam[i][j] < minValue) {
                    // If value is now the smallest value update minValue and the references of [minRow] and [minColumn]
                    minValue = arrayParam[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }
       
        // Returns a 1-D Array formatted as [row, column] of the smallest value
        return new int[]{minRow, minColumn};
    }
}