/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Prints command line arguments
 *
 * When executed with the following
 * java CommandLine1 arg1 arg2 arg3 arg4
 *
 * The following will be printed
 * arg1
 * arg2
 * arg3
 * arg4
 *
 * Note: the first argument is subscript 0
 * The application name is not subscript 0 as with C++
 *
 * When executed with the following
 * java CommandLine1 arg1 "arg2 arg3" arg4
 *
 * The following will be printed
 * arg1
 * arg2 arg3
 * arg4
 */

public class Example_201{

  public static void main(String [] args){

    if(args.length > 0){

      for(int i = 0; i < args.length; ++i){

        System.out.println("args[" + i + "] has a value of " + args[i]);
      }
    }
    else{

      System.out.println("No Command-line arguments were provided.");
    }
  }
}