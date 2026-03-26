/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Two Parameters, Single Return
 */
public class Example_103{

  public static void main(String [] args){

    int localInt_01 = 2;
    int localInt_02 = 3;
    int localInt_03 = 4;

    System.out.println("The max value is: " + Example_103.max(localInt_01, localInt_02));
    System.out.println("The max value is: " + Example_103.max(localInt_01, localInt_03));

    System.out.println("The max value is: " + Example_103.max(localInt_02, localInt_01));
    System.out.println("The max value is: " + Example_103.max(localInt_02, localInt_03));

    System.out.println("The max value is: " + Example_103.max(localInt_03, localInt_01));
    System.out.println("The max value is: " + Example_103.max(localInt_03, localInt_02));
  }

  public static int max(int param_01, int param_02){

    int maxValue;

    if(param_01 > param_02){

      maxValue = param_01;
    }
    else{

      maxValue = param_02;
    }

    return maxValue;
  }
}