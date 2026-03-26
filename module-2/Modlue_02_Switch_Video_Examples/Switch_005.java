/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Switch on Characters Values
 */
public class Switch_005{

  public static void main(String [] args){

    char z;

    z = (char)(Math.random() * 26 + 65);

     switch(z){
 
      case 'A':
        System.out.println('A');
        break;
      case 'B':
        System.out.println('B');
        break;
      case 'C':
        System.out.println('C');
        break;
      case 'D':
        System.out.println('D');
        break;
      case 'E':
        System.out.println('E');
        break;
      case 'F':
        System.out.println('F');
        break;
      case 'G':
        System.out.println('G');
        break;
      case 'H':
        System.out.println('H');
        break;
      case 'I':
        System.out.println('I');
        break;
      case 'J':
        System.out.println('J');
        break;
      case 'K':
        System.out.println('K');
        break;
      case 'L':
        System.out.println('L');
        break;
      case 'M':
        System.out.println('M');
        break;
      case 'N':
        System.out.println('N');
        break;
      case 'O':
        System.out.println('O');
        break;
      case 'P':
        System.out.println('P');
        break;
      case 'Q':
        System.out.println('Q');
        break;
      case 'R':
        System.out.println('R');
        break;
      case 'S':
        System.out.println('S');
        break;
      case 'T':
        System.out.println('T');
        break;
      case 'U':
        System.out.println('U');
        break;
      case 'V':
        System.out.println('V');
        break;
      case 'W':
        System.out.println('W');
        break;
      case 'X':
        System.out.println('X');
        break;
      case 'Y':
        System.out.println('Y');
        break;
      case 'Z':
        System.out.println('Z');
        break;

      // Something we used in the corporate world
      default:
        System.out.println("You should never get here.");
    }
  }
}