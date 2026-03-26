/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * char Return
 */
public class Example_107{

  public static void main(String [] args){

    System.out.println(Example_107.getLetterGrade(92));
    System.out.println(Example_107.getLetterGrade(88));
    System.out.println(Example_107.getLetterGrade(73));
    System.out.println(Example_107.getLetterGrade(68));
    System.out.println(Example_107.getLetterGrade(55));
    System.out.println(Example_107.getLetterGrade(0));
  }

  public static char getLetterGrade(int grade){

    if(grade >= 90){

      return 'A';
    }
    else if(grade >= 80){

      return 'B';
    }
    else if(grade >= 70){

      return 'C';
    }
    else if(grade >= 60){

      return 'D';
    }
    else{

      return 'F';
    }
  }
}