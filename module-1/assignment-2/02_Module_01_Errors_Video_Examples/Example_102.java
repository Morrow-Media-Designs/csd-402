/*
 *
 * Professor Darrell Payne
 * Example_992.java
 *
 * printf()
 * Multiple Parameters
 */
public class Example_102{

  public static void main(String [] args){

    int intVar_01 = 10;
    int intVar_02 = 3;

    System.out.printf("%d + %d = %d\n", intVar_01, intVar_02, (intVar_01 + intVar_02));

    System.out.printf("%d - %d = %d\n", intVar_01, intVar_02, (intVar_01 - intVar_02));

    System.out.printf("%d * %d = %d\n", intVar_01, intVar_02, (intVar_01 * intVar_02));

    System.out.printf("%d / %d = %d\n", intVar_01, intVar_02, (intVar_01 / intVar_02));

    System.out.printf("%d %s %d = %d\n", intVar_01, "%", intVar_02, (intVar_01 % intVar_02));
  }
}