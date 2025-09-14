/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Identifiers
 */
public class Example_003{

  public static void main(String [] args){

    // Valid identifiers
    double abc;
    double abc1;
    double abc_;
    double _abc;
    // Avoid using these two
    double $abc;
    double abc$;

    // Invalid identifiers
    // double #abc;
    // double abc#;
    // double abc%;
    // double abc@;
    // double abc!;
    // double abc%;
    // double abc^;
    // double abc&;
    // double abc*;
    // double abc(;
    // double abc";
  }
}