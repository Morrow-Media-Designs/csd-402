/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 *  Multi-Catch
 * catch multiple exceptions using multi catch syntax
 */

public class Example_1_17{

  public static void main(String[] args){

    int [] intArray = new int[] {2, 4, 6, 8};

    for(int i = 0; i < 5; ++i){

      try{

        switch((int)(Math.random() * 3)){

          case 0:

            System.out.println(intArray[4]);

          case 1:

            System.out.println(100/0);
          case 2:

            Integer.parseInt("Test");
        }
      }
      // Error - Cannot be related by subclassing
      // catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException | Exception e){
      
      catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){

        System.out.println("\n\t\t" + e + "\n");
      }
    }
  }
}