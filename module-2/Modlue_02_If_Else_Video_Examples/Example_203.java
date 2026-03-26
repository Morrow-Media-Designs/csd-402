/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * With {}s
 */
public class Example_203{

  public static void main(String [] args){

    int localInt_01 = (int)(Math.random() * 3 + 1);
    int localInt_02 = (int)(Math.random() * 3 + 1);
    int localInt_03 = (int)(Math.random() * 3 + 1);

    if(localInt_01 == localInt_02){
      
      System.out.println("The values are equal");

    }
    else{

      System.out.println("The values are not equal");
    }

    if(localInt_02 == localInt_03){
      
      System.out.println("The values are equal");

    }
    else{

      System.out.println("The values are not equal");
    }

    if(localInt_03 == localInt_01){
      
      System.out.println("The values are equal");

    }
    else{

      System.out.println("The values are not equal");
    }
  }
}