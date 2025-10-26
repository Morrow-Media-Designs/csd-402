/*
 * Student Justin Morrow | Date: 10/16/2025
 * CSD-402 Module 6 Assignment 1 (Fan Class)
 *
 * References:
 *  Professor Darrell's Weekly Assignment Example_2_02.java: Use of getters method
 *  Professor Darrell's Weekly Assignment Example_2_03.java: Constructors and toString
 *  Professor Darrell's Weekly Assignment Example_3_05.java: Use of setters method
 *  Online Resource: https://www.w3schools.com/java/java_encapsulation.asp
 *  Online Resource: https://www.geeksforgeeks.org/java/getter-and-setter-in-java/
 *  Online Resource: https://javagtu.blogspot.com/2013/10/designa-class-named-fan-to-represent-fan_1.html
 *
 *  IDE: I switched from NetBeans to IntelliJ since I prefer the familiar feel to PyCharm by NetBrains
 */


// Step 01) Write a program with a class titled Fan.
public class Fan {

  // Step 02) Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3.
  public static final int STOPPED = 0;
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;


  // Step 03) A private field named speed that holds one of the constant values with the default being STOPPED.
  private int speed = STOPPED;

  // Step 04) A private Boolean field titled on that specifies whether the fan is on or off.
  private boolean on = false;

  // Step 05) A private field named radius that holds the radius of the fan with a default value of 6.
  private int radius = 6;

  // Step 06) A String field that holds the color, with the default being white.
  private String color = "white";


  // Step 08) A no-argument constructor that sets all fields with a default value. (Refers to the private default values)
  public Fan() {

  }


  // Step 09) A constructor that takes arguments and sets all fields. (Defines the field types: int, boolean, double, string)
  public Fan(int speed, boolean on, int radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
  }


  // Step 07) Getter methods for all mutable/changeable fields
  public int getSpeed() {
    return speed;
  }

  public boolean isOn() {
    return on;
  }

  // Changed original double to int to get rid of the float number X.0 on 10/25/25
  public int getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }


  // Step 07) Setter methods for all mutable/changeable fields
  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }


  // Step 10) Write a toString() method that returns a description of the Fans state.
  public String toString() {
    String speedString;

    // Convert numeric speed (0 - 3) to then text version (Stopped - Fast). UNKNOWN used as else if not matched.
    switch (speed) {
      case SLOW: speedString = "SLOW"; break;
      case MEDIUM: speedString = "MEDIUM"; break;
      case FAST: speedString = "FAST"; break;
      case STOPPED: speedString = "STOPPED"; break;
      default: speedString = "UNKNOWN";
    }

    /* Return different string output depending on whether the fan is ON or OFF
     * If the Fan is ON the output includes the Speed
     * If the Fan is OFF it does not include the Speed
     */
    if (on) {
      return "Fan: on\n" +
             "Speed: " + speedString + "\n" +
             "Radius: " + radius + "\n" +
             "Color: " + color;
    } else {
      return "Fan: off\n" +
             "Radius: " + radius + "\n" +
             "Color: " + color;
    }
  }


  /* Step 11) Write test code that creates two instances of the Fan class,
   * one using the default constructor and the other using the argument constructor.
   * Write code that displays the functionality of the Fan class methods.
  */
  public static void main(String[] args) {

    // Create the 1st Fan instance using the default constructor. (No arguments defined)
    Fan fan1 = new Fan();

    // Create a 2nd Fan instance using the argument constructor. (Arguments defined for each variable)
    Fan fan2 = new Fan(FAST, true, 10, "black");

    // Display Fan 1 Details
    System.out.println("\nFan 1 Details:");
    System.out.println(fan1);
    System.out.println();

    // Display Fan 2 Details
    System.out.println("Fan 2 Details:");
    System.out.println(fan2);
    System.out.println();

    // Update Fan 1 using the setters method
    fan1.setOn(true);
    fan1.setSpeed(MEDIUM);
    fan1.setRadius(8);
    fan1.setColor("brown");

    // Print the updated Fan 1 Details
    System.out.println("Updated Fan 1 Details:");
    System.out.println(fan1);
  }
}