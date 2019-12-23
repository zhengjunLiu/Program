import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tshanchu extends JFrame implements ActionListener{
	Query q =new Query();
	private JPanel p1=new JPanel();
	private JTextField Sid=new JTextField(5);
	private JTextField Cid=new JTextField(5);
    private JButton jbt1=new JButton("É¾³ý");
	 public Tshanchu(){
		 p1.setLayout(new GridLayout(3, 2));
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
		    p1.add(jbt1,BorderLayout.SOUTH);
		    add(p1);
	   }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt1){
			int Sid1=Integer.parseInt(Sid.getText());
			int Cid1 =Integer.parseInt(Cid.getText());
			
	     if(q.shanchu(Sid1, Cid1)){
		  this.setVisible(false);
				new  Tjixu(3);
			}
			  
		}
		else {
			System.out.println("´íÎó");
			
		}
	   
	}
}
