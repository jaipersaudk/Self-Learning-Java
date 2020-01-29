import java.awt.Color;
import java.awt.Graphics;

abstract class MyShape {
  private int x1,x2,y1,y2; //coordinates
  private Color color; //color of shape

  public MyShape() {
    x1 = 0;
    y1 = 0;
    x2 = 0;
    y2 = 0;
    color = Color.RED;
  }

  public MyShape(int x1, int y1, int x2, int y2, Color color) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
  }

  //Methods to set/get x1, x2, y1, y2, Color

  public void setX1(int x1) {
    this.x1 = x1;
  }

  public void setY1(int y1) {
    this.y1 = y1;
  }

  public void setX2(int x2) {
    this.x2 = x2;
  }

  public void setY2(int y2) {
    this.y2 = y2;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getX1(int x1) {
    return x1;
  }

  public int getY1(int y1) {
    return y1;
  }

  public int getX2(int x2) {
    return x2;
  }

  public int getY2(int y2) {
    return y2;
  }

  public Color getColor(Color color) {
    return color;
  }

  public String toString() {
    return "Shape[id = "+id+", area = "+getArea()+"]";
  }

  public double getArea();

  public void draw (Graphics d); //LEFT OFF HERE

}
