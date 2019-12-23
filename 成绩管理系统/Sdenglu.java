

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sdenglu extends JFrame  implements ActionListener {
	   private JPanel p1=new JPanel();
	   private JTextField name=new JTextField(5);
       private JTextField mima=new JTextField(5);
	   private JButton jbt1=new JButton("µÇÂ¼");
	 
	public  Sdenglu () {
		  //p1.setLayout(new GridLayout(10,10));
		
		 jbt1.addActionListener(this);
		  this.setResizable(false);
		  this.setSize(400, 100);
		 this.setBounds(300, 250, 200, 200);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  this.setVisible(true);
	    p1.add(new JLabel("Ñ§ºÅ"));
	    p1.add(name);
	    p1.add(new JLabel("ÃÜÂë"));
	    p1.add(mima);
	    p1.add(jbt1,BorderLayout.SOUTH);
	    add(p1);
		
	}
	
	       public void actionPerformed(ActionEvent e) {
				if(e.getSource()==jbt1){
					
					  this.setVisible(false);
					 new Sgrade(Integer.parseInt(name.getText()), Integer.parseInt(mima.getText()));
					  
				}
			
			}
			
		
 
	

	
}
