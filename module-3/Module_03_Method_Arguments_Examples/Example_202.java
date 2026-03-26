/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Invoke Using a Loop Counter
 */
public class Example_202{

  public static void main(String [] args){

    for(int i = 0; i < 5; ++i){

      Example_202.printParam(i);
      System.out.println();
    }
  }

  public static void printParam(int param){

    System.out.println("\t" + param);
  }
}