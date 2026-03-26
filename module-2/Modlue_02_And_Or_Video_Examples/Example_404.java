/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Logical And - &
 *
 * This is NOT a shortcut operator 
 */
public class Example_404{

  public static void main(String[] args){

    int i1 = 5;
    int i2 = 6;
    int i3 = 7;
    int i4 = 8;

    //    6   F   6        8   T   8
    if((++i1 == ++i2) & (++i3 == i4++)){ // False, !shortcut

      // This line does not print
      System.out.println("true " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
    else{

    //                             6          7          8          9
    // As a result i1, i2, i3, i4 change 
    // i1, i2 and i3 before the test, i4 after the test
      System.out.println("false " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
  }
}