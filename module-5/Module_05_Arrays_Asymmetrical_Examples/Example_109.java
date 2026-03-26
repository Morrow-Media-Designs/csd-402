/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Multiple Dimension Arrays
 * [][][]
 * Initialization Asymmetrical Arrays
 */
public class Example_109{

  public static void main(String [] args){

    int threeDimArray [][][] = {
                                 {
                                   {1, 2, 3, 4}
                                 },
                                 {
                                   {1, 2, 3}
                                 },
                                 {
                                   {1, 2}
                                 },
                                 {
                                   {1}
                                 }
                               };

    int threeDimArray2 [][][] = {
                                 {
                                   {1}
                                 },
                                 {
                                   {1, 2}
                                 },
                                 {
                                   {1, 2, 3}
                                 },
                                 {
                                   {1, 2, 3, 4}
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

    System.out.println();

    for(int i = 0; i < threeDimArray2.length; ++i){
 
      for(int j = 0; j < threeDimArray2[i].length; ++j){

        for(int k = 0; k < threeDimArray2[i][j].length; ++k){

          System.out.print(threeDimArray2[i][j][k] + " ");
        }

        System.out.println();
      }

      System.out.println();
    }
  }
}