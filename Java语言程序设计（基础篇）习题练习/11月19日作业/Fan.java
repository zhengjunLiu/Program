
public class Fan {
	 public static final int SLOW=0;
	 public static final int MEDIUM=0;
	 public static final int FAST=0;
	 public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Fan(int spee,boolean o,double radiu, String colo){
		speed=spee;
		on=o;
		radius=radiu;
		color=colo;
	}
	public Fan(){
		speed=SLOW;
		on=false;
		radius=5;
		color="blue";
	}
     
	 private int speed;
	 private boolean on;
	 private double radius;
	 private String color;
	 public String toString(){
		 String a;
		if(on) a = "  风扇半径为"+radius+"  颜色"+color+"  风速"+speed;
		else
			a=" 风扇半径为  "+radius+" 颜色"+color+"  fan is off";
		return a;
		 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fan a1=new Fan(3,true,10,"yellow");
		 Fan a2=new Fan(2,false,5,"blue");
		 System.out.println("风扇1"+a1.toString());
		 System.out.println("风扇2"+a2.toString());
      }
}
