import java.awt.*;
import java.util.*;

import javax.swing.*;


public class StillClock extends JPanel{
 public int getHour() {
		return hour;
	}
public void setHour(int hour) {
		this.hour = hour;
		repaint();
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		repaint();
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
		repaint();
	}
  private int hour;
 private int minute;
 private int second;
public StillClock(){
	 setCurrentTime();
	
 }
public StillClock(int a,int b,int c){
	 hour=a;
	 minute=b;
	 second=c;
 }
private void setCurrentTime() {
	// TODO Auto-generated method stub
	Calendar calendar=new GregorianCalendar();
	this.hour=calendar.get(Calendar.HOUR_OF_DAY);
	this.minute=calendar.get(Calendar.MINUTE);
	this.second=calendar.get(Calendar.SECOND);
}
/*protected void paintComponenet(Graphics g){
	super.paintComponent(g);
	int clockRadius=(int )(Math.min(getWidth(), getHeight())*0.8*0.5);
	int xc=getWidth()/2;
	int yc=getHeight()/2;
	g.setColor(Color.BLACK);
	g.drawOval(xc-clockRadius, yc-clockRadius, 2*clockRadius, 2*clockRadius);
	g.drawString("12", xc-5,yc-clockRadius+12);
	g.drawString("9",xc-clockRadius+3,yc+5);
	g.drawString("6",xc-3,yc+clockRadius-3);
	g.drawString("3",xc+clockRadius-10,yc+3);
    int sLength=(int)(clockRadius*0.8);
    int xSecont=(int)(xc+sLength*Math.sin(second*(2*Math.PI/60)));
    int ySecont=(int)(yc-sLength*Math.cos(second*(2*Math.PI/60)));
	g.setColor(Color.RED);
	g.drawLine(xc, yc, xSecont, ySecont);
	int mLength=(int)(clockRadius*0.65);
	int xminute=(int)(xc+mLength*Math.sin(minute*(2*Math.PI/60)));
    int yminute=(int)(yc-mLength*Math.cos(minute*(2*Math.PI/60)));
    g.setColor(Color.BLUE);
	g.drawLine(xc, yc, xminute, yminute);
	int hLength=(int)(clockRadius*0.5);
	int xHour=(int)(xc+hLength*Math.sin((hour%12+minute/60)*(2*Math.PI/12)));
    int yHour=(int)(yc-hLength*Math.cos((hour%12+minute/60)*(2*Math.PI/12)));
    g.setColor(Color.GREEN);
	g.drawLine(xc, yc, xHour, yHour);
}*/
protected void  paintComponent(Graphics g){
	   super.paintComponent(g);
	  
		int clockRadius=(int )(Math.min(getWidth(), getHeight())*0.8*0.5);
		int xc=getWidth()/2;
		int yc=getHeight()/2;
		g.setColor(Color.BLACK);
		g.drawOval(xc-clockRadius, yc-clockRadius, 2*clockRadius, 2*clockRadius);
		g.setColor(Color.BLACK);
		g.drawOval(xc-clockRadius, yc-clockRadius, 2*clockRadius, 2*clockRadius);
		for(int i=1;i<=60;i++){
			int length;
			int xc1=(int) (xc+clockRadius*Math.sin(i*(2*Math.PI/60)));
			int yc1=(int) (yc-clockRadius*Math.cos(i*(2*Math.PI/60)));
			int x1,y1;
			if(i%5==0){
				x1=(int)(xc+0.9*clockRadius*Math.sin(i*(2*Math.PI/60)));;
				y1=(int) (yc-0.9*clockRadius*Math.cos(i*(2*Math.PI/60)));
			}
			else
			{
				x1=(int)(xc+0.95*clockRadius*Math.sin(i*(2*Math.PI/60)));;
			y1=(int) (yc-0.95*clockRadius*Math.cos(i*(2*Math.PI/60)));
				
			}
			g.drawLine(xc1, yc1, x1, y1);
		    
		}
		g.drawString("12", xc-10,yc-clockRadius+20);
		g.drawString("11", (int) (xc+clockRadius*(Math.cos(4*2*Math.PI/12))-5),(int) (yc-clockRadius*(Math.sin(4*2*Math.PI/12))+20));
		g.drawString("10", (int) (xc+clockRadius*(Math.cos(5*2*Math.PI/12))+5),(int) (yc-clockRadius*(Math.sin(5*2*Math.PI/12))+15));
		g.drawString("9",xc-clockRadius+10,yc+5);
		g.drawString("8", (int) (xc+clockRadius*(Math.cos(7*2*Math.PI/12))+8),(int) (yc-clockRadius*(Math.sin(7*2*Math.PI/12))));
		g.drawString("7", (int) (xc+clockRadius*(Math.cos(8*2*Math.PI/12))+5),(int) (yc-clockRadius*(Math.sin(8*2*Math.PI/12))-8));
		g.drawString("6",xc-3,yc+clockRadius-10);
		g.drawString("5", (int) (xc+clockRadius*(Math.cos(10*2*Math.PI/12))-8),(int) (yc-clockRadius*(Math.sin(10*2*Math.PI/12))-8));
		g.drawString("4", (int) (xc+clockRadius*(Math.cos(11*2*Math.PI/12))-15),(int) (yc-clockRadius*(Math.sin(11*2*Math.PI/12))-5));
		g.drawString("3",xc+clockRadius-20,yc+3);
		g.drawString("2", (int) (xc+clockRadius*(Math.cos(13*2*Math.PI/12))-15),(int) (yc-clockRadius*(Math.sin(13*2*Math.PI/12))+13));
		g.drawString("1", (int) (xc+clockRadius*(Math.cos(14*2*Math.PI/12))-10),(int) (yc-clockRadius*(Math.sin(14*2*Math.PI/12))+20));
	    int sLength=(int)(clockRadius*0.8);
	    int xSecont=(int)(xc+sLength*Math.sin(second*(2*Math.PI/60)));
	    int ySecont=(int)(yc-sLength*Math.cos(second*(2*Math.PI/60)));
		g.setColor(Color.RED);
		g.drawLine(xc, yc, xSecont, ySecont);
		int mLength=(int)(clockRadius*0.65);
		int xminute=(int)(xc+mLength*Math.sin(minute*(2*Math.PI/60)));
	    int yminute=(int)(yc-mLength*Math.cos(minute*(2*Math.PI/60)));
	    g.setColor(Color.BLUE);
		g.drawLine(xc, yc, xminute, yminute);
		int hLength=(int)(clockRadius*0.5);
		int xHour=(int)(xc+hLength*Math.sin((hour%12+minute/60.0)*(2*Math.PI/12)));
	    int yHour=(int)(yc-hLength*Math.cos((hour%12+minute/60.0)*(2*Math.PI/12)));
	    g.setColor(Color.GREEN);
		g.drawLine(xc, yc, xHour, yHour);
		FontMetrics fm=g.getFontMetrics();
		g.setColor(Color.BLACK);
		String string=new String (hour+":"+minute+":"+second);
		int stringwidth=fm.stringWidth(string);
		int stringheight=fm.getAscent();
		int cx=50*getWidth()/100-stringwidth/2;
		int cy=95*getHeight()/100-stringheight/2;
		g.drawString(string, cx, cy);
		
	}
public Dimension getPre(){
	return new Dimension(200,200);
}


}
