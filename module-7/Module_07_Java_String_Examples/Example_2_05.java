/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Anonymous String Object
 */
public class Example_2_05{

  public static void main(String[] args){

    char charString[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    System.out.println(new String("My First String"));
    System.out.println(new String(charString));
    System.out.println(new String(charString, 2, 3));
  }
}