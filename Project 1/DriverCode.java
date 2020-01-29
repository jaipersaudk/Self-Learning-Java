import javax.swing.*;
import java.awt.*;

public class DriverCode {
  public static void main(String[] args) {
      DrawFrame application = new DrawFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setsize(500,500);
      application.setResizeable(true);
      application.setVisible(true);
      //final int WINDOW_HEIGHT = 500, WINDOW_WIDTH = 500
  }
}
