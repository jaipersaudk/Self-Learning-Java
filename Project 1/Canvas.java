import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Canvas extends JFrame {
  static JFrame f;
  static JLabel l;
  static int width;
  static int height;

  public static void main (String[] args) {
    f = new JFrame("panel");
    l = new JLabel("label");
    JPanel p = new JPanel();
    width = 1000;
    height = 800;
    p.setBackground(Color.white);
    f.add(p);
    f.setSize(width, height); 
    f.show();
  }
}
