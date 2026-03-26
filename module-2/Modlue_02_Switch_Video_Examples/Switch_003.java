/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Some (including myself) will say this should be avoided.
 *
 * Switch Default Case Out of Order
 * 'default' still follows the switch fall-through rule
 */
public class Switch_003{

  public static void main(String[] args){

    switch((int)(Math.random() * 8)){

      default:
        System.out.println("Case 5, 6 or 7 "); // 5, 6 and 7 will also print 0s
        // No break

      case 0:
        System.out.println("Case 0");
        break;

      case 1:
        System.out.println("Case 1");
        break;

      case 2:
        System.out.println("Case 2");
        break;

      case 3:
        System.out.println("Case 3");
        break;

      case 4:
        System.out.println("Case 4");
        break;
    }
  }
}