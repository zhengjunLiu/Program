package jixun10;

import java.awt.*;

import javax.swing.*;

public class Swin extends JFrame{
	public Swin(){
		setLayout(new GridLayout(2,3));
		Font font=new Font("TimesRoman",Font.BOLD,20);
		 JLabel a1=new JLabel("black");
		 a1.setForeground(Color.BLACK);
		 a1.setBackground(Color.WHITE);
		 a1.setFont(font);
		 
		 JLabel a2=new JLabel("blue");
		 a2.setForeground(Color.BLUE);
		 a2.setBackground(Color.WHITE);
		 a2.setFont(font);
		 
		 JLabel a3=new JLabel("cyan");
		 a3.setForeground(Color.CYAN);
		 a3.setBackground(Color.WHITE);
		 a3.setFont(font);
		 
		 JLabel a4=new JLabel("green");
		 a4.setForeground(Color.GREEN);
		 a4.setBackground(Color.WHITE);
		 a4.setFont(font);
		 
		 JLabel a5=new JLabel("magenta");
		 a5.setForeground(Color.MAGENTA);
		 a5.setBackground(Color.WHITE);
		 a5.setFont(font);
		 
		 JLabel a6=new JLabel("orange");
		 a6.setForeground(Color.ORANGE);
		 a6.setBackground(Color.WHITE);
		 a6.setFont(font);
		 add(a1);
		 add(a2);
		 add(a3);
		 add(a4);
		 add(a5);
		 add(a6);
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Swin a=new Swin();
	      a.setTitle("Exercise");
	      a.setSize(400,200);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);
	}
}
