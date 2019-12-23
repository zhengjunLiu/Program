
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class denglujiemian extends JFrame implements ActionListener{
           /**
	 * 
	 */
	private static final long serialVersionUID = -242665019727872923L;

		private JPanel  p1=new JPanel();
    	 
    	   private JButton jbt1=new JButton("学生登录");
    	   private JButton jbt2=new JButton("学生注册"); 
    	   private JButton jbt3=new JButton("教师注册");
    	   private JButton jbt4=new JButton("教师登录"); 
		   
		 public  denglujiemian() {
			
			 jbt1.addActionListener(this);
			 jbt2.addActionListener(this);
			 jbt3.addActionListener(this);
			 jbt4.addActionListener(this);
			  p1.add(jbt1);
			  p1.add(jbt2);
			  p1.add(jbt3);
			 p1.add(jbt4);
			  add(p1,BorderLayout.CENTER);
			
			  
		}
		
		       public void actionPerformed(ActionEvent e) {
					if(e.getSource()==jbt1){
				     this.setVisible(false);
					 new Sdenglu();
					}
					else
						if(e.getSource()==jbt2){
							  this.setVisible(false);
							  new Szhuche();
						
					}
					
						else
							if(e.getSource()==jbt3){
								this.setVisible(false);
								new Tzhuche();
						}
							else
								{
								this.setVisible(false);
								new Tdenglu();
								
							}
				}
			
		 
	public static void main(String[] args) {
	   denglujiemian a=new denglujiemian();
		a.setTitle("登录");
		a.setSize(400, 100);
		a.setLocationRelativeTo(null);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
		/*Query query=new Query();
		if(query.xiugai(1, 1, 50))System.out.print("好了");
		else
			System.out.print("坏了");*/
	}
	

}
