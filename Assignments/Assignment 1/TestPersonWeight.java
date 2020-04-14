/*
Kevin Jaipersaud
CSc 221 - Assignment 1
*/

import java.util.Scanner;

public class TestPersonWeight {

  public static String classifyBMI(double w, double h) {
    System.out.printf("%16s", "Classification: ");

    PersonWeight bmi = new PersonWeight();
    double b = bmi.computeBMI(w, h);

    if ((b >= 0) && (b <= 18.5)) {
      System.out.printf("%12s%n", "Underweight");
    }

    if ((b > 18.5) && (b <= 25.0)) {
      System.out.printf("%14s%n", "Normal Weight");
    }

    if ((b > 25.0) && (b <= 30.0)) {
      System.out.printf("%11s%n", "Overweight");
    }

    if (b > 30.0) {
      System.out.printf("%6s%n", "Obese");
    }

      return null;
  }


  public static void main (String[] args) {

    //ask for name
    Scanner input1 = new Scanner(System.in);
    System.out.printf("Enter person's name: ");
    String n = input1.nextLine();

    PersonWeight name = new PersonWeight();
    name.setName(n);

    //ask for year of birth
    Scanner input2 = new Scanner(System.in);
    System.out.printf("Enter person's year of birth: ");
    int y = input2.nextInt();

    PersonWeight year = new PersonWeight();
    year.setYear(y);

    PersonWeight age = new PersonWeight();

    //ask for height
    Scanner input3 = new Scanner(System.in);
    System.out.printf("Enter person's height (meters): ");
    double h = input3.nextDouble();

    PersonWeight height = new PersonWeight();
    height.setHeight(h);

    // ask for weight
    Scanner input4 = new Scanner(System.in);
    System.out.printf("Enter person's weight (kilograms): ");
    double w = input4.nextDouble();

    PersonWeight weight = new PersonWeight();
    weight.setWeight(w);

    // Full Report
    System.out.printf("%16s %s%n", "Full Name: ", name.getName());
    System.out.printf("%16s %s%n", "Age: ", age.computeAge(y));
    System.out.printf("%16s %s %s%n", "Height: ", height.getHeight(), "m");
    System.out.printf("%16s %s %s%n", "Weight: ", weight.getWeight(), "kg");
    classifyBMI(w,h);
  }
}
