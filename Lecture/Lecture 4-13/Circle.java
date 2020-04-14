
// shape is an interface so we use implements keyword
// any class that implements the shape class must define the methods in the interface class
// if you cannot define all methods from the interface class, then you can name the class as abstract
public abstract class Circle implements Shape {

  private double radius;

  public Circle() {


  }

  public double area() {

    return Math.PI

  }

  public double perimeter() {

    return Math.PI * 2* radius;

  }

  public void draw() {

    System.out.println("Circle");

  }

}
