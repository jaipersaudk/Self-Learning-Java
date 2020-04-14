public class Square extends ParentClass {

  private double length;
  private String name = "Square";

  public Square() {
    super.name = "Square";
  }

  public double area() {
    return length*length;
  }

  public double perimeter() {
    return 2*length + 2*length;
  }

  public void draw() {
    System.out.println("Square");
  }

}
