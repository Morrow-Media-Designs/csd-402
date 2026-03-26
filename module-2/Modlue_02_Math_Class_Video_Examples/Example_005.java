/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * max(x, y) Returns the number with the highest value
 * double|float|int|long
 */
public class Example_005{

  public static void main(String [] args){

    int i1 = 44;
    int i2 = 55;

    long long_01 = 54;
    long long_02 = 58;

    float f1 = 22.5F;
    float f2 = 33.6F;

    double d1 = 66.4;
    double d2 = 77.5;

    System.out.println(Math.max(i1, i2) + " " + Math.max(i2, i1)); // 55  55
    System.out.println(Math.max(long_01, long_02) + " " + Math.max(long_02, long_01)); // 58  58

    System.out.println(Math.max(f1, f2) + " " + Math.max(f2, f1)); // 33.6  33.6
    System.out.println(Math.max(d1, d2) + " " + Math.max(d2, d1)); // 77.5  77.5

    // Correct
    i1 = Math.max(i1, i2);
    long_01 = Math.max(long_02, long_01);
    f2 = Math.max(f1, f2);
    d2 = Math.max(d2, d1);

    long_01 = Math.max(i2, long_01);
    d2 = Math.max(d2, f1);
  
    
    // Errors
    // i1 = Math.max(long_02, long_01);
    // i1 = Math.max(i2, long_01);
    // f2 = Math.max(d1, d2);
    // f2 = Math.max(f1, d2);
  }
}