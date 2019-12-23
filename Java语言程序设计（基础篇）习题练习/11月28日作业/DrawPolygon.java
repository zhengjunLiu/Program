
import java.awt.*;

import javax.swing.*;



public class DrawPolygon extends JFrame {
    public DrawPolygon(){
    	setTitle("Õý¶à±ßÐÎ");
    	setLayout(new GridLayout(1,5));
    	for(int i=5;i<=10;i++)add(new RegularPolygonsPanel(i));
    	
    }
	public static void main(String[] args) {
		DrawPolygon a=new DrawPolygon();
	     
	      a.setSize(800,200);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);

	}
 class RegularPolygonsPanel extends JPanel{
	 private int numberOfSide;
	 public RegularPolygonsPanel(int n){
		 super();
		 numberOfSide=n;
	 }
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int xC=getWidth()/2;
		int yC=getHeight()/2;
		int radius=(int)(Math.min(getWidth(), getHeight())*0.4);
		Polygon  polygon=new Polygon();
		for(int i=1;i<=numberOfSide;i++){
			polygon.addPoint((int)(xC+radius*Math.cos(i*2*Math.PI/numberOfSide)), (int)(yC-radius*Math.sin(i*2*Math.PI/numberOfSide)));
		}
		g.drawPolygon(polygon);
	}
 }
}
