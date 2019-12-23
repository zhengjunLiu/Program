import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tzhuche extends JFrame implements ActionListener{
	 private Query q =new Query();
	 private JPanel p1=new JPanel();
	 private JTextField id=new JTextField(5);
	  private JTextField name=new JTextField(5);
	   
     private JTextField mima=new JTextField(5);
     private JTextField sex=new JTextField(5);

    
     private JTextField phone=new JTextField(5);
  
      private JButton jbt1=new JButton("注册");
      public Tzhuche(){
    	  this.setResizable(false);
    	  this.setSize(300, 200);
    	 this.setBounds(300, 250, 200, 200);
    	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	  this.setVisible(true);
    	  p1.setLayout(new GridLayout(8,2));
        p1.add(new JLabel("教师编号"));
        p1.add(id);
        p1.add(new JLabel("姓名"));
        p1.add(name);
        p1.add(new JLabel("性别"));
        p1.add(sex);
        p1.add(new JLabel("电话"));
        p1.add(phone);  
        p1.add(new JLabel("密码") );
        p1.add(mima);
        p1.add(jbt1,BorderLayout.CENTER);
        add(p1);
        jbt1.addActionListener(this);
    }
      public void actionPerformed(ActionEvent e) {
    		if(e.getSource()==jbt1){
    			
    			int     id1=Integer.parseInt(id.getText());
    			String	name1=name.getText();
    			String	sex1=sex.getText();
    			int 	phone1=Integer.parseInt(phone.getText());
    			int 	mima1=Integer.parseInt(mima.getText());
    			Teacher t=new Teacher(id1, name1, sex1,  phone1, mima1);
    	         q.zhuche(t);
    	         this.setVisible(false);
    			 new Tdenglu();
    			  
    		}
       }
}
