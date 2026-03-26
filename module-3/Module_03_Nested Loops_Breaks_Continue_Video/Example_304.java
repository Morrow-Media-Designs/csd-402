/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Break Example in a Loop
 *
 * Remember We Can Also Use a Break in a Switch
 */
public class Example_304{

  public static void main(String [] args){

    for(int i = 0; i < 10; ++i){

      System.out.println("------------------------------------------------------------------");

      for(int j = 0; j < 10; ++j){

        if((i == (int)(Math.random() * 3 + 1)) || (j == (int)(Math.random() * 3 + 1))){

          // Exit all the inner loop iterations
          System.out.println("break;");
          break;
        }

        System.out.printf("i = %d, j = %d\n", i, j);
      }
    }
  }
}