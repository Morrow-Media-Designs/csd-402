/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Multiple Dimension Arrays
 * [][][]
 * Initialization Symmetrical Arrays
 */
public class Example_108{

  public static void main(String [] args){

    int threeDimArray [][][] = {
                                 {
                                   {1, 2, 3}
                                 },
                                 {
                                   {1, 2, 3}
                                 },
                                 {
                                   {1, 2, 3}
                                 }
                               };

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