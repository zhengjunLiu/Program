

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
public class Sgrade extends JFrame {
private Query q =new Query();
     private JPanel jp1=new JPanel();
      public Sgrade(int id,int mima){
		  
    	   JTextArea jt = new JTextArea(); 
		   Student s=new Student(id,mima);
		   ArrayList<Sc> sc=q.chaxun(s.getId());
		   ArrayList<Course> c=new  ArrayList<Course>();
		   String  []strings={"课程号","课程名","学分","分数","学时"};
		if(q.denglu(s)==null);
   
		   else{
		    	
		        for(int i=0;i<sc.size();i++){
		         c.add(	q.kec(sc.get(i).getCid()));
		         if(sc.get(i).getGrate()<60)c.get(i).setXuef(0);
		        }
		        
  
       Object[][]objs=new Object[sc.size()][5]; 
       for(int i=0;i<sc.size();i++){
    	  
    		   objs[i][0]=sc.get(i).getCid();
    		   objs[i][1]=c.get(i).getCname();
    		   objs[i][2]=c.get(i).getXuef();
    		   objs[i][3]=sc.get(i).getGrate();
    		   objs[i][4]=c.get(i).getStime();
    		   
    	   
       }
       JTableHeader header=new JTableHeader();
      
       JTable jt1=new JTable(objs,strings);
       JScrollPane scrollPane = new JScrollPane(jt1);
       add(scrollPane);
     }
      this.setTitle("登录后的主界面");
      this.setSize(400, 400);
      this.setVisible(true);
      this.setLocationRelativeTo(null);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
}
	private void DefaultTableModel(Object[][] objs, String[] strings) {
		// TODO Auto-generated method stub
		
	}
	/*public Sgrade(){
		setLayout(new GridLayout(1,5));
		add(new JTextArea("1234") );
		add(new JTextArea("1234") );
		add(new JTextArea("1234") );
		add(new JTextArea("1234") );
		add(new JTextArea("1234") );
		
	
		
	}
	public static void main(String[] args) {
		Sgrade a=new Sgrade();
		a.setTitle("登录");
		a.setSize(400, 100);
		a.setLocationRelativeTo(null);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}*/
}
