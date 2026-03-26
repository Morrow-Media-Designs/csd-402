/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Scope - Loops - Correction
 */
public class Example_105{

  public static void main(String [] args){

    int i;

    for(i = 0; i < 10; ++i){

      if(i == 3){

        break;
      }
    }

    System.out.println("Three was found: " + i);
  }
}