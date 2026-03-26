/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * else if
 */
public class Example_304{

  public static void main(String [] args){

    int grade = (int)(Math.random() * 101);

    System.out.println("Grade value is " + grade);

    if(grade >= 90){

      System.out.println("Grade = A");
    }
    else if(grade >= 70){

      System.out.println("Grade = C");
    }
    else if(grade >= 60){

      System.out.println("Grade = D");
    }
    else{

      System.out.println("Grade = F");
    }
  }
}