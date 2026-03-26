/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scope - Loops - Error
 */
public class Example_104{

  public static void main(String [] args){

    for(int i = 0; i < 10; ++i){

      if(i == 3){

        break;
      }
    }

    System.out.println("Three was found: " + i);
  }
}