/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Possible Errors That Differs From C/C++
 */
public class Switch_004{

  public static void main(String[] args){

    // okay
    // int i = 128;

    // byte i = 0; // ????
    // short i = 0; // ok for 128, but not 65536
    // int i = 128; //ok
    // int i = 0; //ok
    // int i = 65536; //ok
    // int i = 65599; //ok

    switch(i){

      default:
        System.out.println("Case 5, 6 or 7");
        break;

      case 0:
        System.out.println("Case 0");
        break;

      case 1:
        System.out.println("Case 1");
        break;

      case 2:
        System.out.println("Case 2");
        break;

      case 127:
        System.out.println("Case 127");
        break;

      case 128: //too large for byte
        System.out.println("Case 128");
        break;

      case 32768: //too large for short and byte
        System.out.println("Case 32768");
        break;
    }
  }
}