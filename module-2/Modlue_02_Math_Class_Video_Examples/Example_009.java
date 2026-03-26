/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * round(x) Returns the value of x rounded to its nearest integer
 * Return int|long
 *
 * public static int round(float x)  
 * public static long round(double x)  
 */
public class Example_009{

  public static void main(String [] args){

    int int_01 = 9;
    int int_02;
    long long_01 = 343;
    long long_02;
    float f1 = 9.5F;
    double d1 = 94.54;

    int_02 = Math.round(int_01);// 9
    int_02 = Math.round(f1); // 10
    int_02= Math.round(long_01); // 343

    System.out.println(Math.round(int_01));
    System.out.println(Math.round(f1));
    System.out.println(Math.round(long_01));

    // Error
    // int_02 = Math.round(d1);
    // Valid
    long_02 = Math.round(d1);
  }
}