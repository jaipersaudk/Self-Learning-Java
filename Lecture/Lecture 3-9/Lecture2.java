import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;

public class Lecture2 {
  public static void main(String[] args) throws Exception { //need to throw Exception

    Scanner scanner = new Scanner(new FileInputStream(new File("abc.txt"))); //how to input txt file into scanner

    while (scanner.hasNext()) {
      System.out.println(scanner.next()); // print each line of the txt file

    }

    scanner.close();

    /* Exception Handling

    try {
      //any lines that may throw an error and any line associated with it
      int y = 10, x = 0;
      double division = y/x; // this will throw ArithmeticException
      System.out.println(division);
    }

    catch (ArithmeticException e) {
      //code to handle the Exception
      System.out.println("Cannot Divide by 0. Try Again");
    }

    */
  }
}
