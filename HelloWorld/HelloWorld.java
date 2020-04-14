/*
public class HelloWorld {
  public static void main (String[] args){
    System.out.println("HelloWorld"); // java is strictly object oriented
  } //end of main method
} //end of class HelloWorld
*/

// Lecture 2/3
/* Command Prompt: java Test arg0 arg1
 * Program: String[arg0 arg1...] args
 */

/*
 * only one public class per source file
 * can have multiple classes in a source file, but it cannot be public
 */


// Formatting strings
/*
public class HelloWorld {
  public static void main (String[] args) {
    System.out.println("Hello World");
  }
}

// class within a public class
class Test1 {
  public static void main (String[] args) {
    System.out.println("This is a test");

    System.out.printf("%1s%15s%n", "Name", "Class"); //formatting the output --> only for strings
                                                    // %#s - treat the next arg as string and how many leading spaces (including negative #s)
                                                          // len - wc
                                                    // %n - go to the next line
                                                    // tabs are fixed lengths (about 8 spaces)

    System.out.printf("%,10d%n", 1234500);            // %d - for integers
    System.out.printf("%,10.3f%n", 12345.12345);      //%f - for floating integers
  }
}
*/

/* Escape Characters - Modifies strings
 * \n
 * \t
 * \r
 * \\
 * \"
 */

/*
public class HelloWorld {
  public static void main (String[] args) {

  }
}
*/
