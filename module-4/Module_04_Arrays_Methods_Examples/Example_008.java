/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Count Array Elements
 */
public class Example_008{

  public static void main(String [] args){

    int [] ints = Example_008.createArray(100);

    Example_008.fillMyArray(ints);

    System.out.println("Counted Array 1: ");
    Example_008.printArray(Example_008.countNumbers(ints));

    // or

    int [] counts = countNumbers(ints);

    System.out.println("Counted Array 2: ");
    Example_008.printArray(counts);


    Example_008.fillMyArray(ints);

    counts = Example_008.countNumbers(ints);

    System.out.println("Counted Array New Values: ");
    Example_008.printArray(counts);
  }

  public static int [] countNumbers(int [] arrayParam){

    int [] counts = new int [10];

    for(int i = 0; i < arrayParam.length; ++i){

      ++counts[arrayParam[i]];
    }

    return counts;
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

      arrayParam[i] = (int)(Math.random() * 10);
    }
  }
}