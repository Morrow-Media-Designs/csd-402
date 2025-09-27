/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    Resource video code below: https://bellevue.mediaspace.kaltura.com/media/Nested+Break+Continue/1_30gklddg
    public class Pyramids_03 {
        public static void main(String[] args) {
            int row;
            int column;
            int space;
            for (row = 1; row <= 6; ++row) {
                for (space = 6; space > row; --space) {
                    System.out.print("  ");
                }
                for (column = 1; column <= row; column++) {
                    System.out.print(column + " ");
                }
                System.out.println();
 */
package com.example.CSD402.Module03;

/*
* Student Justin Morrow | Date: 09/26/2025
* CSD-402 Module 3 Assignment 1: Incrementing/Reduction power of 2 Number Pyramid including @ symbol 
*/

public class NumberPyramid {
    public static void main(String[] args) {
       
        // I changed the number of rows from 6 to 7 to accomodate the additional row
        for (int row = 1; row <= 7; ++row) {
            // I changed the spaces from 6 to 7 to keep the pyramid centered with the new row of numbers
            for (int space = 7; space > row; --space) {
                System.out.print("   ");
            }

            // This creates the ascending numbers by a power of 2 until i is less than the rows which is 7 and it starts at 0
            int power = 1;
            for (int ascending = 0; ascending < row; ++ascending) {
                System.out.print(power + " ");
                power = power * 2;
            }

            // This creates the descending numbers by a power of 2 until i is less than or equal to 0
            for (int descending = row - 2; descending >= 0; --descending) {
                power = 1;
                for (int exponent = 0; exponent < descending; exponent++) {
                    power = power * 2;
                }
                System.out.print(power + " ");
            }

            // Loop for the ending @ symbol. I can't figure how to keep it in same column
            int charPerRow = 2 * row - 1; // Ex: Row 4 is (4 * 2 - 1) = 7
            int maxNum = 13; // Row 7's number count = 13 (1, 2, 4, 8, 16, 32, 64, 32, 16, 8, 4, 2, 1)
            int numSpaces = (maxNum - charPerRow); // Calculate spaces at the end of each row for @ symbol
            
            // I was trying to get it to work with the adverse of the initial spacing but it didn't
            // Then I tried this equation without the / 2 and it veered more to the right
            // This version with / 2 gets me the closest to a straight line
            // Please provide inform me what I'm doing wrong or to see your working code to understand it better.
            for (int endSpacing = 0; endSpacing < numSpaces / 2; endSpacing++){
                System.out.print("  ");
            }
            
            // My other solution was adding spaces in the below print statement for @ symbol but that's not in the same column either 
            System.out.print("@");
            System.out.println();
            }
        }
    }