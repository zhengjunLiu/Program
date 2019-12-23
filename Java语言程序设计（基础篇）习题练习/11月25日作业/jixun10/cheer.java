package jixun10;

import java.awt.GridLayout;

import javax.swing.*;

public class cheer extends JFrame  {
   public cheer(){
	   setLayout(new GridLayout(3,3));
	  for(int i=0;i<9;i++){
	   int c= (int) ((Math.random()*10)%3);
	   if(c==0)add(new JButton(us));
	   if(c==1)add(new JButton(us1));
	   if(c==2)add(new JButton()); 
	   }
   }
   private ImageIcon us=new ImageIcon("F:/Java/us.jpg");
   private ImageIcon us1=new ImageIcon("F:/Java/my.jpg");
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  cheer a=new cheer();
	      a.setTitle("Exercise12_5");
	      a.setSize(800,800);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);
	}

}
