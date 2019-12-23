import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tdenglu extends JFrame  implements ActionListener{
	Query q =new Query();
	private JPanel p1=new JPanel();
	private JTextField id=new JTextField(5);
    private JTextField mima=new JTextField(5);
	   private JButton jbt1=new JButton("µÇÂ¼");

	   public Tdenglu(){
		  //p1.setLayout(new GridLayout(2,2));
		   jbt1.addActionListener(this);
			  this.setResizable(false);
			  this.setSize(400, 200);
			 this.setBounds(300, 250, 200, 200);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			  this.setVisible(true);
		    p1.add(new JLabel("±àºÅ"));
		    p1.add(id);
		    p1.add(new JLabel("ÃÜÂë") );
		    p1.add(mima);
		    p1.add(jbt1,BorderLayout.SOUTH);
		    add(p1);
	   }
       public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jbt1){
				int id1=Integer.parseInt(id.getText());
				int mima1 =Integer.parseInt(mima.getText());
				
			
		     if(q.Tdenglu(new Teacher(id1, mima1))!=null){
					new Tgrade(); 
					this.setVisible(false);
				}
				  
			}
		   
		}
    
}
