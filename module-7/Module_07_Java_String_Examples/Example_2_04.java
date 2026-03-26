/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * String Constructors
 *
 * From the Java API
 *
   String manipulation is one of the most common activities in any programming 
   languages, and Java is not an exception.  Strings in Java are immutable 
   objects and assigning a new String value invoking a String method like 
   replace actually causes a new String object to be create and the new reference
   returned.  The same may be said about the concatenation operator.  
   In Java we may not overload operators, however the + operator have been 
   overloaded for us to work with String objects.
   
   Constructors:
   String() 
   Initializes a newly created String object so that it represents an empty character sequence. 

   String(byte[] bytes) 
   Constructs a new String by decoding the specified array of bytes using the platform's default charset. 

   String(byte[] bytes, Charset charset) 
   Constructs a new String by decoding the specified array of bytes using the specified charset. 

   String(byte[] bytes, int offset, int length) 
   Constructs a new String by decoding the specified subarray of bytes using the platform's default charset. 

   String(byte[] bytes, int offset, int length, Charset charset) 
   Constructs a new String by decoding the specified subarray of bytes using the specified charset. 

   String(byte[] bytes, int offset, int length, String charsetName) 
   Constructs a new String by decoding the specified subarray of bytes using the specified charset. 

   String(byte[] bytes, String charsetName) 
   Constructs a new String by decoding the specified array of bytes using the specified charset. 

   String(char[] value) 
   Allocates a new String so that it represents the sequence of characters currently contained in the character array argument. 

   String(char[] value, int offset, int count) 
   Allocates a new String that contains characters from a subarray of the character array argument. 

   String(int[] codePoints, int offset, int count) 
   Allocates a new String that contains characters from a subarray of the Unicode code point array argument. 

   String(String original) 
   Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string. 

   String(StringBuffer buffer) 
   Allocates a new string that contains the sequence of characters currently contained in the string buffer argument. 

   String(StringBuilder builder) 
   Allocates a new string that contains the sequence of characters currently contained in the string builder argument. 

   Deprecated:  
   String(byte[] ascii, int hibyte) 
   This method does not properly convert bytes into characters. As of JDK 1.1, the preferred way to do this is via the String constructors that take a Charset, charset name, or that use the platform's default charset. 
   String(byte[] ascii, int hibyte, int offset, int count) 
   This method does not properly convert bytes into characters. As of JDK 1.1, the preferred way to do this is via the String constructors that take a Charset, charset name, or that use the platform's default charset. 
 *
 * A few of the String constructors
 */
public class Example_2_04{

  public static void main(String[] args){

    // Array Subscripts   0    1    2    3    4    5    6    7    8    9
    char charString[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    /*
     * String Literal parameter
     * String(String original)
     */
    String s1 = new String("My First String");
    /*
     * char array parameter
     * String(byte[] bytes) 
     */
    String s2 = new String(charString);
    /*
     * char array in part
     * String(byte[] bytes, int offset, int length) 
     * 2 3 4
     * C D E
     */
    String s3 = new String(charString, 2, 3); // 'C', 'D', 'E',
    /*
     * Another String object parameter
     * String(String original)
     */
    String s4 = new String (s1);

    String s5 = "Test 1 2 3 4";

    System.out.println("String object s1 = " + s1);
    System.out.println("String object s2 = " + s2);
    System.out.println("String object s3 = " + s3);
    System.out.println("String object s4 = " + s4);
    System.out.println("String object s5 = " + s5);
  }
}