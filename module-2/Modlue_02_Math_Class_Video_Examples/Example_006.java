/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * min(x, y) Returns the number with the lowest value
 * double|float|int|long
 */
public class Example_006{

  public static void main(String [] args){

    int i1 = 44;
    int i2 = 55;

    long long_01 = 54;
    long long_02 = 58;

    float f1 = 22.5F;
    float f2 = 33.6F;

    double d1 = 66.4;
    double d2 = 77.5;

    System.out.println(Math.min(i1, i2) + " " + Math.min(i2, i1)); // 44  44
    System.out.println(Math.min(long_01, long_02) + " " + Math.min(long_02, long_01)); // 54  54

    System.out.println(Math.min(f1, f2) + " " + Math.min(f2, f1)); // 22.5  22.5
    System.out.println(Math.min(d1, d2) + " " + Math.min(d2, d1)); // 66.4  66.4

    // Correct
    i1 = Math.min(i1, i2);
    long_01 = Math.min(long_02, long_01);
    f2 = Math.min(f1, f2);
    d2 = Math.min(d2, d1);

    long_01 = Math.min(i2, long_01);
    d2 = Math.min(d2, f1);
  
    
    // Errors
    // i1 = Math.min(long_02, long_01);
    // i1 = Math.min(i2, long_01);
    // f2 = Math.min(d1, d2);
    // f2 = Math.min(f1, d2);
  }
}