/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * double == double ?
 */
public class Example_201{

  public static void main(String [] args){

    double var_01 = 14.23;
    double var_02 = 27.67;

    if((var_01 + var_02) == 41.90){

      System.out.println("Everything is OKAY");
    }
    else{

      System.out.println("Houston we may have a problem.");
      System.out.println(" as in " + (var_01 + var_02));
    }
  }
}