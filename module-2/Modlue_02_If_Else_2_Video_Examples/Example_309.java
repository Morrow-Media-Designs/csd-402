/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * What is the problem with this code?
 */
public class Example_309{

  public static void main(String [] args){

    int grade = (int)(Math.random() * 101);

    System.out.println("Grade value is " + grade);

    if(grade >= 90){

      System.out.println("Grade = A");
    }
    if(grade >= 80){

      System.out.println("Grade = B");
    }
    if(grade >= 70){

      System.out.println("Grade = C");
    }
    if(grade >= 60){

      System.out.println("Grade = D");
    }
    else{

      System.out.println("Grade = F");
    }
  }
}