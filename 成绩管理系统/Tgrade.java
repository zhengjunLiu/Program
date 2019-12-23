import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tgrade extends JFrame  implements ActionListener{
	   private JPanel  p1=new JPanel();  
	   private JButton jbt1=new JButton("修改成绩"); 
       private JButton jbt2=new JButton("输入成绩");
	   private JButton jbt3=new JButton("删除成绩");
	   public  Tgrade() {
		   
			  this.setResizable(false);
			  this.setSize(400, 100);
			 this.setBounds(300, 250, 200, 200);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			  this.setVisible(true);
			  jbt1.addActionListener(this);
			  jbt2.addActionListener(this);
			  jbt3.addActionListener(this);
			  p1.add(jbt1);
			  p1.add(jbt2);
			  p1.add(jbt3);
			  add(p1,BorderLayout.CENTER);
			
			  
		}
		
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jbt1){
				
				 this.setVisible(false);
				 new Txiugai();
				  
			}
			else 
				if(e.getSource()==jbt2){
					 this.setVisible(false);
					 new Tcharu();
			}
				else 
					if(e.getSource()==jbt3){
						 this.setVisible(false);
						 new Tshanchu();
				}
		}
}
