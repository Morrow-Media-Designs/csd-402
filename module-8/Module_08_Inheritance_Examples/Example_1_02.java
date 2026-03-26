/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Cat_02 is-a Animal_02 - True
 * Dog_02 is-a Animal_02 - True
 * Snake_02 is-a Animal_02 - True
 *
 * Animal_02 is-a Cat_02 - false
 * Animal_02 is-a Dog_02 - false
 * Animal_02 is-a Snake_02 - false
 *
 * public class Example_1_02 extends Object{
 */
public class Example_1_02{

  public static void main(String [] args){

  }
}

class Animal_02{}

class Cat_02 extends Animal_02{}

class Dog_02 extends Animal_02{}

class Snake_02 extends Animal_02{}