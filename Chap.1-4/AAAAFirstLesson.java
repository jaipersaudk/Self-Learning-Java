public class HelloWorld { //defining a new class called HelloWorld. HelloWorld is the name of the class
  public static void main(String[] args) { // every application must contain a main method by this signature
    /*
    * public: So that JVM can execute the method from anywhere.
    * static: Main method is to be called without object.
      The modifiers public and static can be written in either order.
    * void: The main method doesn't return anything.
    * main(): Name configured in the JVM.
    * String[]: The main method accepts a single argument:
      an array of elements of type String.
    */
    System.out.println("Hello World. My Name is Kevin"); // println is part of the System.out object
    /*
     * Outputs are accomplished by the built in function println()
     * System is a predefined class that provides access to the System
     * out is the variable of type output stream that is connected to the console
     * both system and out are called identifiers, but when combined with a ".", it is called a name
    */
  }
}

/*
 * title case for class names - HelloWorld
 *

*/
