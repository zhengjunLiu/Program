package jixun10;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class Text extends JFrame{
	public Text(){
		JLabel a=new JLabel("Department if Computer Science");
		JLabel b=new JLabel("School of Computer");
		JLabel c=new JLabel("Armstrong Atlantic University");
		JLabel d=new JLabel("Tel:(912)921-6440");
		setLayout(new GridLayout(7,1));
		add(a);
		add(new New());
		add(b);
		add(new New());
		add(c);
		add(new New());
		add(d);
		
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text a=new Text();
      a.setTitle("Exercise12_5");
      a.setSize(200,200);
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      a.setVisible(true);
	}
 class New extends JPanel{
	 protected void paintComponent(Graphics g){
		        super.paintComponents(g);
				g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
				
			
	 }
 }
}
