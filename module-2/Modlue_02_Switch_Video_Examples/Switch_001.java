/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Switch Statements
 * Simple Java Switch Structure
 */
public class Switch_001{

  public static void main(String[] args){

    switch((int)(Math.random() * 7)){

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