/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Nested for Loops
 */
public class Example_303{

  public static void main(String [] args){

    for(int i = 2; i < 4; ++i){

      for(int j = 3; j < 5; ++j){

        for(int k = 4; k < 7; ++k){
   
          System.out.printf("%2d * %2d * %2d = %4d\n", i, j, k, (i * j * k));
        }
      }
    }

    System.out.println();

    // Can we do this?

    for(int i = 3; i < 5; ++i){

      for(int j = 4; j < 6; ++j){

        for(int k = 6; k < 8; ++k){
   
          for(int m = 8; m < 10; ++m){

            for(int p = 2; p < 4; ++p){

              System.out.printf("%2d + %2d + %2d + %2d + %2d = %4d\n", i, j, k, m, p, (i + j + k + m + p));
            }
          }
        }
      }
    }
  }
}