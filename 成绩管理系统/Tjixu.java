import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Tjixu extends JFrame implements ActionListener{
	private int va;
	 private JPanel  p1=new JPanel();
     private JButton jbt1=new JButton("����");
	   private JButton jbt2=new JButton("����"); 
	   public Tjixu(int i){
		   va=i;
		   this.setResizable(false);
			  this.setSize(400, 100);
			 this.setBounds(300, 250, 200, 200);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			  this.setVisible(true);
		   jbt1.addActionListener(this);
		   jbt2.addActionListener(this);
		   JLabel j=new JLabel("��ɱ༭");
		   p1.add(j);
		   p1.add(jbt1);
		   p1.add(jbt2);
		  
		   
		   add(p1);
	   }
	    public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt1){
			  this.setVisible(false);
			   if(va==1) new Txiugai();
			   else 
			      if(va==2)new Tcharu();
			      else 
				      if (va==3)new Tshanchu();
				      else
				      {
				    	  System.out.println("����");
				      }
					
			
			  }
		  if(e.getSource()==jbt2){
			   this.setVisible(false);
			  new Tgrade();
			 
			  
		}
	}
	   
}
