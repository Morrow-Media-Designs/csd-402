/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Logical And - && - Shortcut Operator
 */
public class Example_403{

  public static void main(String[] args){

    int i1 = 5;
    int i2 = 6;
    int i3 = 7;
    int i4 = 8;

    //    6   F   7       never evaluated
    if((++i1 == ++i2) && (i3++ == ++i4)){ // False

      // This line does not print
      System.out.println("true " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
    else{

    //                             6          7          7          8
    // As a result i1 and i2 change, i3 and i4 do not change
    // i1 and i2 change before the test
      System.out.println("false " + i1 + " " + i2 + " " + i3 + " " + i4);
    }
  }
}