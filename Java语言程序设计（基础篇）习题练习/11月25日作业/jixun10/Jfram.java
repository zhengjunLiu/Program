package jixun10;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jfram extends JFrame{
       public Jfram(){
    	   setLayout(new GridLayout(8,8));
    	   
    	   for(int i=0;i<8;i++){
    		   for(int j=0;j<8;j++)
    			   {
    			   if((i+j)%2==0) {
    				   JButton a=new JButton();
    				   a.setBackground(Color.WHITE);
    				   add(a);
    			   }
    			   else
    			   {
    				   JButton a=new JButton();
				       a.setBackground(Color.BLACK);
				       add(a);
    				   
    			   }
    			   }
    	   }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jfram a=new Jfram();
	      a.setTitle("Exercise");
	      a.setSize(400,400);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);
	}

}
