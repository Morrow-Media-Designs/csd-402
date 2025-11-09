/*
 * Student Justin Morrow | Date: 11/9/2025
 * CSD-402 Module 9 Program 1 (ArrayList with for-each loop, try/catch for exception handling of out of bounds, and Autoboxing/Auto-Unboxing)
 *
 * References:
 * Example_1_01: ArrayIndexOutOfBoundsException
 * Example_1_14: Exception handling with try/catch
 * Example_1_17: NumberFormatException exception and Parsing Integers from the ArrayList
 * Online Resource: https://www.w3schools.com/java/ref_arraylist_get.asp
 * Online Resource: https://www.w3schools.com/java/java_foreach_loop.asp
 */

import java.util.*;

public class Module9Program1 {
    public static void main(String[] args) {


        // Write a program that uses an ArrayList filled with a minimum of 10 Strings
        ArrayList<String> nflGames = new ArrayList<String>();
        nflGames.add("\n01) Raiders vs Broncos");
        nflGames.add("02) Browns vs Jets");
        nflGames.add("03) Patriots vs Buccaneers");
        nflGames.add("04) Bills vs Dolphins");
        nflGames.add("05) Jaguars vs Texans");
        nflGames.add("06) Lions vs Commanders");
        nflGames.add("07) Steelers vs Chargers");
        nflGames.add("08) Falcons vs Colts");
        nflGames.add("09) Saints vs Panthers");
        nflGames.add("10) Ravens vs Vikings");
        nflGames.add("11) Giants vs Bears");
        nflGames.add("12) Cardinals vs Seahawks");
        nflGames.add("13) Rams vs 49ers");
        nflGames.add("14) Eagles vs Packers");
        nflGames.add("15) Not a football fan");


        // Use a ‘for-each’ loop to print the ArrayList collection
        System.out.println("\nNFL Week 10 Games:");
        for (String game : nflGames) {
            System.out.println(game);
        }


        // Then ask a user which element they would like to see again
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nEnter the number of the game your most excited to see (1-15): ");


        // Attempt printing the element in a try/catch format which will result in the element being displayed
        // userInput is first read as a String (gameSelection) to enable error handling using the try/catch
        // If valid, it is converted to an int (gameNumber) for use in the ArrayList

        String gameSelection = userInput.nextLine();
        try {

            // Added the - 1 so it will take the user input and -1 since it's 0 based this appears more user friendly 1-15
            int gameNumber = Integer.parseInt(gameSelection) - 1;
            String selectedItem = nflGames.get(gameNumber);
            System.out.println("You selected the Game: " + selectedItem);
            System.out.print("\nWe hope it is a good game and your team wins!\n");
        }

            // Example_1_17 shows multiple catch exceptions but to display them separately for error "Out of Bounds" I broke them up
            // This will catch entries that are not integers/numbers (Ex: a letter or symbol)
            catch (NumberFormatException exception) {
                System.out.println("Invalid: You didn't enter a number 1-15");
        }

            // If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”
            // I tried ArrayIndexOutofBoundsException, but it crashed if I entered 16 with is a number outside the 15 elements in the ArrayList
            // IntelliJ program showed me a tab completion to use Index instead of Array and it works correctly.
            catch (IndexOutOfBoundsException exception) {
                System.out.println("Out of Bounds");
        }

        // Close the Scanner
        userInput.close();
    }
}