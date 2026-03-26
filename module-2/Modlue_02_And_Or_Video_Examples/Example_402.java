/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Logical Or - |
 *
 * This is NOT a shortcut operator 
 */
public class Example_402{

  public static void main(String[] args){

    int i1 = 5;
    int i2 = 6;
    int i3 = 7;
    int i4 = 8;

    //   6    T   6        7   F   9
    if((++i1 == i2++) | (i3++ == ++i4)){ // True, !shortcut

    //                            6          7          8          9
    // As a result i1, i2, i3, i4 change 
    // i1 and i4 before the test, i2 and i3 after the test
      System.out.println("true " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
    else{

      // This line does not print
      System.out.println("false " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
  }
}