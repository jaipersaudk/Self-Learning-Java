
// can only be public
public interface Shape {

  public double PI = 3.14; // already assumed to be static final since the class is an interface

  public String name = ""; // cannot be protected and must be defined

  public String getName();

  public abstract double area(); // still assumed to be abstract

  public double perimeter();

  public void draw();

}
