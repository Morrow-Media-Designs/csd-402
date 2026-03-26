/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * void Return
 */
public class Example_108{

  public static void main(String [] args){

    Example_108.printLetterGrade(92);
    Example_108.printLetterGrade(88);
    Example_108.printLetterGrade(73);
    Example_108.printLetterGrade(68);
    Example_108.printLetterGrade(55);
    Example_108.printLetterGrade(0);
  }

  public static void printLetterGrade(int grade){

    if(grade >= 90){

      System.out.println("The letter grade is \'A\'");
    }
    else if(grade >= 80){

      System.out.println("The letter grade is \'B\'");
    }
    else if(grade >= 70){

      System.out.println("The letter grade is \'C\'");
    }
    else if(grade >= 60){

      System.out.println("The letter grade is \'D\'");
    }
    else{

      System.out.println("The letter grade is \'F\'");
    }
  }
}