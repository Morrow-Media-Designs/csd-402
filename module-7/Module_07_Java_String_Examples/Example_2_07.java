/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * equals() vs ==
 */
public class Example_2_07{

  public static void main(String[] args){

    String s1 = new String("Mad Magazine");
    String s2 = new String("Mad Magazine");
    String lit1 = "Mad Magazine";
    String lit2 = "Mad Magazine";

    System.out.println();

    if( s1.equals(s2) ){ // True
      System.out.println(s1 + ".equals(" + s2 + ") is True");
    }
    else{
      System.out.println(s1 + ".equals(" + s2 + ") is False");
    }

    if( lit1.equals(lit2) ){ // True
      System.out.println(lit1 + ".equals(" + lit2 + ") is True");
    }
    else{
      System.out.println(lit1 + ".equals(" + lit2 + ") is False");
    }

    if( s1.equals(lit1) ){ // True
      System.out.println(s1 + ".equals(" + lit1 + ") is True");
    }
    else{
      System.out.println(s1 + ".equals(" + lit1 + ") is False");
    }

    System.out.println("\n");

    if( s1 == s2 ){ // False
      System.out.println(s1 + " == " + s2 + ") is True");
    }
    else{
      System.out.println(s1 + " == " + s2 + ") is False");
    }

    if( lit1 == lit2 ){ // True
      System.out.println(lit1 + " == " + lit2 + ") is True");
    }
    else{
      System.out.println(lit1 + " == " + lit2 + ") is False");
    }

    if( s1 == lit1 ){ // False
      System.out.println(s1 + " == " + lit1 + ") is True");
    }
    else{
      System.out.println(s1 + " == " + lit1 + ") is False");
    }

    System.out.println("\n");
  }
}