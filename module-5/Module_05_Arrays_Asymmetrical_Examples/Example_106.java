/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * What do you think this proves?
 *
 * Even More Dimensions
 * Multiple Dimension Arrays
 * [][][]
 * Symmetrical
 *
 * WOW
 */
public class Example_106{

  public static void main(String [] args){

    int threeDimArray [][][][][][] = new int [6][6][6][6][6][6];

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          for(int m = 0; m < threeDimArray[i][j][k].length; ++m){

            for(int n = 0; n < threeDimArray[i][j][k][m].length; ++n){

              for(int p = 0; p < threeDimArray[i][j][k][m][n].length; ++p){

                threeDimArray[i][j][k][m][n][p] = (int)(Math.random() * 6 + 1);
              }
            }
          }
        }
      }
    }

    for(int i = 0; i < threeDimArray.length; ++i){
 
      for(int j = 0; j < threeDimArray[i].length; ++j){

        for(int k = 0; k < threeDimArray[i][j].length; ++k){

          for(int m = 0; m < threeDimArray[i][j][k].length; ++m){

            for(int n = 0; n < threeDimArray[i][j][k][m].length; ++n){

              for(int p = 0; p < threeDimArray[i][j][k][m][n].length; ++p){

                System.out.print(threeDimArray[i][j][k][m][n][p] + " ");
              }

              System.out.println();
            }

            System.out.println();
          }

          System.out.println();
        }

        System.out.println();
      }

      System.out.println();
    }
  }
}