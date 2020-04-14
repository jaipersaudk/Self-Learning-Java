import java.util.Scanner;

public class Notes {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int number1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int number2 = input.nextInt();

    int sum = number1 + number2;
    System.out.printf("Sum is %d%n", sum);
  }
}

class Test2 {
  public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your name: ");

    String name = keyboard.nextLine();
    System.out.println(name);

  }
}
