import java.awt.Graphics;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class xiti27 extends JFrame{
 private int [][]a;
 public xiti27(int [][]b){
	 a=b;
	 add(new newp());
 }
 
 public static void main(String[] args) throws Exception {
         
	 
		// TODO Auto-generated method stub
	   int [][]b={{0,30,30,1},{1,90,30,0},{2,30,90,0,3,4},{3,90,90,1,2,4,5},{4,30,150,2,3,5},{5,90,150,3,4}};   
	   File file=new File("ÎÄ¼þ.txt");
	   PrintWriter out=new PrintWriter(file);
	   for(int i=0;i<b.length;i++){
		   
		   for(int j=0;j<b[i].length;j++)
			   {
			   out.print(b[i][j]+" ");
			  
			   }
		   out.println(";");
		  
	   }
	   out.close();
	   int x=0,y=0;
       Scanner input=new Scanner(file);
       int [][]d=new int[10][10];
      
      input.close();
	     xiti27 a=new xiti27(b);
	      
	      a.setTitle("µã");
	      a.setSize(400,400);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);
	}

  class newp extends JPanel{
	 
	 protected void paintComponent(Graphics g){
	 super.paintComponents(g);
	 for(int k=0;k<a.length;k++){
		 g.fillOval(a[k][1]-5,a[k][2]-5 , 10, 10);
	 }
	 for(int i=0;i<a.length;i++){
		 	for(int j=3;j<a[i].length;j++){
			 g.drawLine(a[i][1], a[i][2],a[a[i][j]][1],a[a[i][j]][2] );
			 
		 }
	 }
 }	 


}

}