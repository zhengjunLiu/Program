import javax.swing.*;

import java.awt.Graphics;
import java.awt.GridLayout;
public class Text extends JFrame {
 public Text(){
	 setTitle("DrawArce");
	 setLayout(new GridLayout(2,2));
	 add(new ArcsPanel());
	 add(new ArcsPanel());
	 add(new ArcsPanel());
	 add(new ArcsPanel());
	 
 }
	
	public static void main(String[] args) {
		Text frame=new Text();
		frame.setTitle("The Front View  of a Microwave Oven");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
class ArcsPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	      int xCenter=getWidth()/2;
	      int yCenter=getHeight()/2;
	      int radius=(int)(Math.min(getWidth(), getHeight())*0.4);
	      System.out.println(radius);
	      int x=xCenter-radius;
	      int y=yCenter-radius;
	      g.drawOval(x, y, 2*radius, 2*radius);
	      g.fillArc(x, y, 2*(radius), 2*(radius), 30, 30);
	      g.fillArc(x, y, 2*(radius), 2*(radius), 120, 30);
	      g.fillArc(x, y, 2*(radius), 2*(radius), 210, 30);
	      g.fillArc(x, y, 2*(radius), 2*(radius), 300, 30);
       }
  }
}
