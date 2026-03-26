/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * equalsIgnoreCase()
 */
public class Example_2_08{

  public static void main(String[] args){

    String s1 = "Mad Magazine";
    String s2 = "MAD MAGAZINE";
    String s3 = "mad magazine";

    System.out.println();

    if( s1.equalsIgnoreCase(s2) ){ // True
      System.out.println(s1 + ".equalsIgnoreCase(" + s2 + ") is True");
    }
    else{
      System.out.println(s1 + ".equalsIgnoreCase(" + s2 + ") is False");
    }

    System.out.println();

    if( s2.equalsIgnoreCase(s3) ){ // True
      System.out.println(s2 + ".equalsIgnoreCase(" + s3 + ") is True");
    }
    else{
      System.out.println(s2 + ".equalsIgnoreCase(" + s3 + ") is False");
    }

    System.out.println();

    if( s3.equalsIgnoreCase(s1) ){ // True
      System.out.println(s3 + ".equalsIgnoreCase(" + s1 + ") is True");
    }
    else{
      System.out.println(s3 + ".equalsIgnoreCase(" + s1 + ") is False");
    }
  }
}