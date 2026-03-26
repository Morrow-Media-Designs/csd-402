/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * + and concat() 
 */

public class Example_205{

  public static void main(String [] args){

    String localString_01 = "Welcome ";
    String localString_02 = "to ";
    String localString_03 = "Java.";

    // Concatenating  String
    String allTogetherNow_01 = localString_01 + localString_02 + localString_03;
    // Or
    String allTogetherNow_03 = localString_01.concat(localString_02.concat(localString_03));

    System.out.println(allTogetherNow_01);
    System.out.println(allTogetherNow_03);
  }
}