// println - prints the line given as an input and then proceeds to the next line
// print - prints the line given as an input but doesnt proceed to the next line
// String concatenation - we use a "+" to append one string to another if the input cannot fit on one line
//                      - the "+" is essentially <<
// Booleans - datatype is boolean --> similar to C++ as bool


public class Countdown {
  public static void main (String[] args) {
    // the following inputs are all printed on the same line
    System.out.print("Three...");
    System.out.print("Two...");
    System.out.print("One...");
    System.out.println("Liftoff!!!");
    // input is printed on its own line
    System.out.println("Houston, we have a problem");

    // concantenates both strings since they "didnt" fit on the same line
    System.out.println("All systems failed..."
                        + "plan B is in full effect!");

    // Difference between concantenation and addition
    System.out.println("24 and 45 concantenated: " + 24 + 45);
    System.out.println("24 and 45 added: " + (24+45));

    // Variables
    int keys = 88;
    final int MAX = 45; // this values cannot be changed once set (uppercase used for constant values) --> similar to const
    System.out.print("A piano has " + keys + " keys!\n");
    System.out.print(MAX);
  }
}
