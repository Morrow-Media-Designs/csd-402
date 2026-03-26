import java.io.*;
import java.util.*;
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * File Class
 *
 * Absolute and Relitive File Name
 *
 * Absolute
 *
 * C:\Temp\myFile.txt
 * /home/myFiles/myFile.txt
 *
 * Relative 
 * myFile.txt
 * ./myFile.txt
 * ./files/myFile2.txt
 *
 */
public class Example_1_30{

  public static void main(String[] args){

    // myFile.txt
    // ./myFile2.txt

    File file1 = new File("myFile1.txt");
    File file2 = new File("./myFile3.txt");
    File file3 = new File("./files/myFile2.txt");
    File file4 = new File("files");
    File file5 = new File("E:/school/01_CSD_405_Java_II/_New_New_Module_05/Examples_04");

    System.out.println("File exist? " + file1.exists());
    System.out.println("File exist? " + file2.exists());
    System.out.println("File exist? " + file3.exists());
    System.out.println("Directory exist? " + file4.exists());

    System.out.println();

    System.out.println("File length - " + file1.length());
    System.out.println("File length - " + file2.length());
    System.out.println("File length - " + file3.length());
    System.out.println("Directory length - " + file4.length());

    System.out.println();

    System.out.println("File canRead? " + file1.canRead());
    System.out.println("File canRead? " + file2.canRead());
    System.out.println("File canRead? " + file3.canRead());
    System.out.println("Directory canRead? " + file4.canRead());

    System.out.println();

    System.out.println("File canWrite? " + file1.canWrite());
    System.out.println("File canWrite? " + file2.canWrite());
    System.out.println("File canWrite? " + file3.canWrite());
    System.out.println("Directory canWrite? " + file4.canWrite());

    System.out.println();

    System.out.println("File isDirectory? " + file1.isDirectory());
    System.out.println("File isDirectory? " + file2.isDirectory());
    System.out.println("File isDirectory? " + file3.isDirectory());
    System.out.println("Directory isDirectory? " + file4.isDirectory());

    System.out.println();

    System.out.println("File isFile? " + file1.isFile());
    System.out.println("File isFile? " + file2.isFile());
    System.out.println("File isFile? " + file3.isFile());
    System.out.println("Directory isFile? " + file4.isFile());

    System.out.println();

    /* On this document we will be showing a java example on how to use the isAbsolute() method of File Class. 
     *    This method tests whether this abstract pathname is absolute. 
     * https://javatutorialhq.com/java/io/file-class-tutorial/isabsolute-method-example/
     */
    System.out.println("File isAbsolute? " + file1.isAbsolute());
    System.out.println("File isAbsolute? " + file2.isAbsolute());
    System.out.println("File isAbsolute? " + file3.isAbsolute());
    System.out.println("Directory isAbsolute? " + file4.isAbsolute());

    // Another check
    System.out.println();
    System.out.println("Directory isAbsolute? " + file5.isAbsolute());

    System.out.println();

    System.out.println("File get absolute path = " + file1.getAbsolutePath());
    System.out.println("File get absolute path = " + file2.getAbsolutePath());
    System.out.println("File get absolute path = " + file3.getAbsolutePath());
    System.out.println("Directory get absolute path = " + file4.getAbsolutePath());
    System.out.println("Directory get absolute path = " + file5.getAbsolutePath());

    System.out.println();

    System.out.println("Last Modified?" + new Date(file1.lastModified()));
    System.out.println("Last Modified?" + new Date(file2.lastModified()));
    System.out.println("Last Modified?" + new Date(file3.lastModified()));
    System.out.println("Last Modified?" + new Date(file4.lastModified()));
  }
}