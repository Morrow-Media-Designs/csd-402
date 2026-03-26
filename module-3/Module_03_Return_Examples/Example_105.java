/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Two Methods
 */
public class Example_105{

  public static void main(String [] args){

    int localInt_01 = 2;
    int localInt_02 = 3;

    System.out.println("The max value is: " + Example_105.max(localInt_01, localInt_02));
    System.out.println("The max value is: " + Example_105.max(localInt_02, localInt_01));

    System.out.println();

    System.out.println("The min value is: " + Example_105.min(localInt_01, localInt_02));
    System.out.println("The min value is: " + Example_105.min(localInt_02, localInt_01));

    System.out.println();
  }

  public static int max(int param_01, int param_02){

    if(param_01 > param_02){

      return param_01;
    }
    else{

      return param_02;
    }
  }

  public static int min(int param_01, int param_02){

    if(param_01 < param_02){

      return param_01;
    }
    else{

      return param_02;
    }
  }
}