import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Txiugai extends JFrame implements ActionListener{
	   private Query q =new Query();
	   private JPanel p1=new JPanel();
	   private JTextField Sid=new JTextField(5);
	   private JTextField Cid=new JTextField(5);
       private JTextField grade=new JTextField(5);
	   private JButton jbt1=new JButton("ÐÞ¸Ä");
	   public Txiugai(){
		   p1.setLayout(new GridLayout(4, 2));
		   jbt1.addActionListener(this);
			  this.setResizable(false);
			  this.setSize(400, 100);
			 this.setBounds(300, 250, 200, 200);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			 this.setVisible(true);
		    p1.add(new JLabel("Ñ§ºÅ"));
		    p1.add(Sid);
		    p1.add(new JLabel("¿Î³ÌºÅ"));
		    p1.add(Cid);
		    p1.add(new JLabel("³É¼¨") );
		    p1.add(grade);
		    p1.add(jbt1,BorderLayout.SOUTH);
		    this.add(p1);
	   }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt1){
			System.out.println(Integer.parseInt(grade.getText()));
			if(q.xiugai(Integer.parseInt(Sid.getText()),Integer.parseInt(Cid.getText()),Integer.parseInt( grade.getText())))
			  {
				this.setVisible(false);
				new Tjixu(1);
			  }
			else {
				System.out.println("´íÎó");
				
			}
			  
			  
		}
	
	}
}
