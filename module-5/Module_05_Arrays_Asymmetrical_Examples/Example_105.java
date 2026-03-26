/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * More Dimensions
 * [][][]
 * Symmetrical
 */
public class Example_105{

  public static void main(String [] args){

    int threeDimArray [][][] = new int [3][3][3];

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          threeDimArray[i][j][k] = (int)(Math.random() * 6 + 1);
        }
      }
    }

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          System.out.print("(threeDimArray[" + i + "][" + j + "][" + k + "] " + threeDimArray[i][j][k] + ")  ");
        }

        System.out.println();
      }

      System.out.println();
    }
  }
}