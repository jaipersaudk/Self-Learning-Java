public class Circle extends ParentClass {

  // so circle must have methods called area, perimeter, and draw since it is a child of an abstract class that has those methods
  // could declare circle as abstract but that doesnt make sense
  // therefore, define the methods in this class

  private double radius;
  private String name = "Circle";

  public Circle() {
    super.name = "Cirlce";
  }

  public double area() {

    return Math.PI * radius * radius;

  }

  public double perimeter() {

    return 2*Math.PI*radius;

  }

  public void draw() {

    System.out.println("Circle");

  }

}
