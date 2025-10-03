/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Resource: https://www.w3schools.com/Java/java_arrays.asp
 * Resource: https://www.w3schools.com/java/java_methods_overloading.asp
 * Resource: https://www.geeksforgeeks.org/java/java-best-practices/
 */
package com.example.CSD402.Module04;

/*  Student Justin Morrow | Date: 10/02/2025
    CSD-402 Module 4 Assignment 1
    I'm using method overloading to reuse the method name 'average' with 4
    different array types: short, int, long, and double. This way, I don't need
    to make 4 different method names like averageShort, averageInt, etc. */

public class OverloadMethodsAverageArray {
    /*  int sum = 0; used to allow overflow for numbers larger than the method.
        Keep looping if the current loop iterration is less than the the array.length (count) 
        Update the previous sum value with the next number in the Array (sum = sum + array[i];)
        Return the method type (short, int, long, double) based on the final Average (sum / array.length)
        Note: all my Array's are 5 numbers so in my case it's total sum / 5. */
    
    // public static short average (short [ ] array)
    public static short average(short[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (short)(sum / array.length);
    }

    // public static int average (int [ ] array)
    public static int average(int[] array) {
        long sum = 0; // Use long to avoid overflow
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (int)(sum / array.length);
    }

    // public static long average (long [ ] array)
    public static long average(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    // public static double average (double [ ] array)
    public static double average(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    // The main method defining each of the 4 methods and the valus in their Array (5 numbers each)
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30, 40, 50};
        int[] intArray = {100, 200, 300, 400, 500};
        long[] longArray = {1000, 2000, 3000, 4000, 5000};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Print the average for each Array method defined in main method above
        System.out.println("\nShort Array: (16-bit Small Integer)");
        printArray(shortArray);
        System.out.println("The Short Average is: " + average(shortArray) + "\n\n");

        System.out.println("Int Array: (32-bit Standard Integer)");
        printArray(intArray);
        System.out.println("The Integer Average is: " + average(intArray) + "\n\n");

        System.out.println("Long Array: (64-bit Large Integer)");
        printArray(longArray);
        System.out.println("The Long Average is: " + average(longArray) + "\n\n");

        System.out.println("Double Array: (64-bit Floating Decimal Number)");
        printArray(doubleArray);
        System.out.println("The Double Average is: " + average(doubleArray) + "\n\n");
    }

    // Print each number in the Array, defined in the main method, with a comma and space for better formatting
    public static void printArray(short[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}