

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;


public class xiti1 extends JFrame{
   public xiti1(){
	   add(new NewPanel());
   }
   class NewPanel extends JPanel{
	   protected void  paintComponent(Graphics g){
		   super.paintComponent(g);
		   g.setColor(Color.RED); 
		   g.drawLine(getWidth()/3, 0, getWidth()/3, getHeight());
		   g.drawLine(2*getWidth()/3, 0, 2*getWidth()/3, getHeight());
		   g.setColor(Color.BLUE); 
		   g.drawLine(0, getHeight()/3, getWidth(), getHeight()/3);
		   g.drawLine(0,2*getHeight()/3 , getWidth(), 2*getHeight()/3);
	   }
   }
	public static void main(String[] args) {
		  xiti1 a=new xiti1();
	      a.setTitle("Exercise");
	      a.setSize(400,400);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);

	}

}
