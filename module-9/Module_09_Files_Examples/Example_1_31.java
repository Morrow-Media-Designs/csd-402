import java.io.*;
import java.util.*;
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Read Write File
 *
 * myFile4.txt
 *
 * PrintWriter & Scanner
 *
 * File here will not be appended
 * 
 */
public class Example_1_31{

  public static void main(String [] args){

    File file = new File("myFile4.txt");
    PrintWriter pw;
    Scanner sc;

    try{

      pw = new PrintWriter(file);

      System.out.println("Write File");

      pw.println( (int)(Math.random() * 100) + 1 );
      pw.println( (int)(Math.random() * 100) + 1 );
      pw.println( (int)(Math.random() * 100) + 1 );
      pw.println( (int)(Math.random() * 100) + 1 );

      pw.close();
    }
    catch(IOException ioe){

      System.out.println("IOException has been thrown. - 1");
    }

    try{

      System.out.println("\nRead File");

      sc = new Scanner(file);

      while(sc.hasNext()){

        System.out.println(sc.next());
      }      
    }
    catch(IOException ioe){

      System.out.println("IOException has been thrown. - 2");
    }
  }
}
