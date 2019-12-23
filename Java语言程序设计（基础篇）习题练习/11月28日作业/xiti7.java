

import java.awt.*;

import javax.swing.*;



public class xiti7 extends JFrame {
   public xiti7(){
	   setLayout(new GridLayout(3,3));
	   for(int i=0;i<9;i++){
		   int a=(int) ((Math.random()*10)%3);
		   if(a==1)add(new NewPanel());
		   if(a==0)add(new JPanel());
		   if(a==2)add(new NewPanel1());
	   }
   }
   class NewPanel extends JPanel{
	   protected void  paintComponent(Graphics g){
		   super.paintComponent(g);
		   g.drawOval(0, 0,getWidth() ,getHeight());
		}
   }
   class NewPanel1 extends JPanel{
	   protected void  paintComponent(Graphics g){
		   super.paintComponent(g);
		   g.drawLine(0, getHeight()/5, getWidth(), 4*getHeight()/5);
		   g.drawLine(0, 4*getHeight()/5, getWidth(), getHeight()/5);;
		}
   }
	public static void main(String[] args) {
		  xiti7 a=new xiti7();
	      a.setTitle("Exercise");
	      a.setSize(400,300);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);

	}
   
}
