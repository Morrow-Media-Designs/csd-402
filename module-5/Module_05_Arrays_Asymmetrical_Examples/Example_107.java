/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Multiple Dimension Arrays
 * [][][]
 * Asymmetrical
 */
public class Example_107{

  public static void main(String [] args){

    int threeDimArray [][][];

    threeDimArray = new int[(int)(Math.random() * 6 + 2)][][];

    for(int i = 0; i < threeDimArray.length; ++i){
 
      threeDimArray[i] = new int[(int)(Math.random() * 6 + 2)][];
    }

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        threeDimArray[i][j] = new int[(int)(Math.random() * 6 + 2)];
      }
    }

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          threeDimArray[i][j][k] = (int)(Math.random() * 90 + 10);
        }
      }
    }

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          System.out.print(threeDimArray[i][j][k] + " ");
        }

        System.out.println();
      }

      System.out.println();
    }
  }
}