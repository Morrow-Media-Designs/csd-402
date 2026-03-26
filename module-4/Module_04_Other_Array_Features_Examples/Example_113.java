/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Error? Why?
 */
public class Example_113{

  public static void main(String[] args){

    double [] prices =   {20.23, 30.43, 40,32, 50.99, 70.12};

    int [] itemNumbers = {  123,   234,   345,   456,   567};

    for(int i = 0; i < prices.length; ++i){

      System.out.println("The cost for item " + itemNumbers[i] + " is " + prices[i]);
    }
  }
}