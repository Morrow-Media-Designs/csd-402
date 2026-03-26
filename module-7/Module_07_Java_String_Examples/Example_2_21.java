/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Integer.parseInt(String)
 * Double.parseDouble(String)
 * Float.parseFloat(String)
 */
public class Example_2_21{

  public static void main(String [] args){

    String s1 = new String("22");
    String s2 = new String("33");
    String s3 = new String("11.33");
    String s4 = new String("22.33");
    String s5 = new String("33.11");
    String s6 = new String("44.11");

    int totalInts = 0;
    float floatTotal = 0.0F;
    double totalDouble = 0.0;

    totalInts = Integer.parseInt(s1) + Integer.parseInt(s2);
    System.out.println("totalInts = " + totalInts);

    totalDouble = Double.parseDouble(s3) + Double.parseDouble(s4);
    System.out.println("totalDouble = " + totalDouble);

    floatTotal = Float.parseFloat(s5) + Float.parseFloat(s6);
    System.out.println("floatTotal = " + floatTotal);
  }
}