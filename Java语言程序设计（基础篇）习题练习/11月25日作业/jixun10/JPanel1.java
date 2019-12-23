package jixun10;

import javax.swing.*;

public class JPanel1 extends JPanel{
	public  JPanel1 (){
		add(new JButton("OK"));
		add(new JButton("hello"));
		add(new JButton("KO"));
		JFrame j=new JFrame();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel1 a=new JPanel1();
        JFrame b=new JFrame();
        JPanel1 c=new JPanel1();
        a.add(c);
        b.add(a);
     
        b.setSize(400, 300);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setLocationRelativeTo(null);;
        b.setVisible(true);
        
	}

	
 
}
