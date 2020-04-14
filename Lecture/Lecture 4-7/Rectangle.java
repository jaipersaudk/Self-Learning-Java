public class Rectangle extends ParentClass {

  private double width;
  private double height;
  private String name = "Rectangle";

  public Rectangle() {
    super.name = "Rectangle";
  }

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return 2*width + 2*height;
  }

  public void draw() {
    System.out.println("Rectangle");
  }
}
