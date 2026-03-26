/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Continue Example
 */
public class Example_305{

  public static void main(String [] args){

    for(int i = 0; i < 10; ++i){

      System.out.println("------------------------------------------------------------------");

      for(int j = 0; j < 10; ++j){

        if((i == (int)(Math.random() * 3 + 1)) || (j == (int)(Math.random() * 3 + 1))){

          // Exit this inner loop iteration
          System.out.println("continue;");
          continue;
        }

        System.out.printf("i = %d, j = %d\n", i, j);
      }
    }
  }
}