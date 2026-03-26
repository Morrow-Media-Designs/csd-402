/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Sort Arrays Manually
 */
public class Example_012{

  public static void main(String [] args){

    int array2[] = Example_012.createArray(8);

    Example_012.fillMyArray(array2);

    Example_012.printArray(array2);

    Example_012.selectionSort(array2);

    Example_012.printArray(array2);

    System.out.println("33 found at: " + binary(array2, 33));
    System.out.println("44 found at: " + binary(array2, 44));
    System.out.println("55 found at: " + binary(array2, 55));
    System.out.println("66 found at: " + binary(array2, 66));
    System.out.println("77 found at: " + binary(array2, 77));
  }

  public static void selectionSort(int [] ArrayParam) {

    for (int i = 0; i < ArrayParam.length - 1; i++) {

      int currentMin = ArrayParam[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < ArrayParam.length; j++) {

        if (currentMin > ArrayParam[j]) {

          currentMin = ArrayParam[j];
          currentMinIndex = j;
        }
      }

      if (currentMinIndex != i) {
        ArrayParam[currentMinIndex] = ArrayParam[i];
        ArrayParam[i] = currentMin;
      }
    }
  }

  public static int binary(int [] intArray, int key){

    int lowValue = 0;
    int highValue = intArray.length - 1;

    while (highValue >= lowValue){

      int midValue = (lowValue + highValue) / 2;

      if (key < intArray[midValue]){

        highValue = midValue - 1;
      }
      else if (key == intArray[midValue]){

        return midValue;
      }
      else{

        lowValue = midValue + 1;
      }
    }

    return -lowValue - 1;
  }

  public static int [] createArray(int size){

    return new int [size];
  }

  public static void printArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; i++){

      System.out.print("[" + i + "] = " + arrayParam[i]);

      if(i < arrayParam.length - 1){

        System.out.print(", ");
      }
    }

    System.out.println("\n");
  }

  public static void fillMyArray(int [] arrayParam){

    for(int i = 0; i < arrayParam.length; ++i){

      arrayParam[i] = (int)(Math.random() * 100);
    }
  }
}