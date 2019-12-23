import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class xiti28 extends JFrame {
  private DrawArrow arrow = new DrawArrow();
  private JButton button = new JButton("Draw a Random Arrow Line");

  public xiti28() {
    JPanel panel = new JPanel();
    panel.add(button);
    getContentPane().add(arrow, BorderLayout.CENTER);
    getContentPane().add(panel, BorderLayout.SOUTH);
    arrow.setBackground(Color.white);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        arrow.randomPoints();
      }
    });
  }

  public static void drawArrowLine(int x1, int y1, 
      int x2, int y2, Graphics g) {
    g.setColor(Color.red);
    g.drawLine(x1, y1, x2, y2);
    double slope = ((((double) y1) - (double) y2)) / (((double) x1) - (((double) x2)));
   double arctan = Math.atan(slope);
    double set45 = 1.57 / 2;
     if (x1 < x2) {
      
      set45 = -1.57 * 1.5;
    }

  
    int arrlen = 10;

    
    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan + set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan + set45) * arrlen)));

    g.drawLine(x2, y2, (int) ((x2 + (Math.cos(arctan - set45) * arrlen))),
        (int) (((y2)) + (Math.sin(arctan - set45) * arrlen)));
  }
  

  public static void main(String[] args) {
    JFrame frame = new xiti28();
    frame.setTitle("¼ýÍ·");
    frame.setSize(350, 300);
    frame.setLocation(20, 20);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class DrawArrow extends JPanel {
  private int x1 = 0;
  private int y1 = 0;
  private int x2 = 0;
  private int y2 = 0;
  
  public void randomPoints() {
    x1 = (int)(Math.random() * (getWidth() - 12));
    y1 = (int)(Math.random() * (getHeight() - 12));
    x2 = (int)(Math.random() * (getWidth() - 12));
    y2 = (int)(Math.random() * (getHeight() - 12));
    repaint();
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    xiti28.drawArrowLine(x1, y1, x2, y2, g);
  }
}