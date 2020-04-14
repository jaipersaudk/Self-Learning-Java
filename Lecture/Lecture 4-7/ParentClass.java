/*
 * if a class has at least 1 abstract method, then that class must be Abstract
 * an abstract class is a PARENT class that is like a contract
 * an abstract class cannot be instantiated
 * an abstract class is an incomplete class (when a method is called, it finds the proper child class) --> the methods have no instructions
 * abstract class are built for inheritance
 * abstract classes can have abstract and non-abstract methods
*/

public abstract class ParentClass {

  protected String name;

  // no point of adding getName methods to each of the Shape classes
  // add a non-abstract method in this abstract class

  public String getName() {

    return name;

  }

  public static int getNum() {
    return 0;
  }

  // rectangle and sqaure have similar methods but they have different variable names.
  // there is not way to implement a proper parent class this way

  // Abstract class can help

  // area is a similar method between rectangle and square, but we will leave the method evaluation up to the child class
  public abstract double area();

  public abstract double perimeter();

  public abstract void draw();




}
