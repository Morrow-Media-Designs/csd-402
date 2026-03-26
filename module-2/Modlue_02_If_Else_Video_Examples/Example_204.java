/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * With {}s
 */
public class Example_204{

  public static void main(String [] args){

    int localInt_01 = (int)(Math.random() * 6 + 1);
    int localInt_02 = (int)(Math.random() * 6 + 1);
    int localInt_03 = (int)(Math.random() * 6 + 1);

    if(localInt_01 == localInt_02){
      
      System.out.print("The values are ");
      System.out.println("equal");

    }
    else{

      System.out.print("The values are not ");
      System.out.println("equal");
    }

    if(localInt_02 == localInt_03){
      
      System.out.print("The values are ");
      System.out.println("equal");

    }
    else{

      System.out.print("The values are not ");
      System.out.println("equal");
    }

    if(localInt_03 == localInt_01){
      
      System.out.print("The values are ");
      System.out.println("equal");

    }
    else{

      System.out.print("The values are not ");
      System.out.println("equal");
    }
  }
}