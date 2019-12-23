package ArrayList;

public class Circle {

		public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
		private double x;
		private double y;
		private double radius;
		public Circle(){
			x=0;
			y=0;
			radius=1;
		}
		public Circle(double a,double b,double c){
			x=a;
			y=b;
			radius=c;
		}
		public double getArea(){
			return 3.1415926*radius*radius;
		}
		public double getPerimeter(){
			return 2*3.1415926*radius;
		}
		public boolean contain(double a,double b){
			boolean f=false;
			if(radius>Math.sqrt((b*b-y*y)/(a*a-x*x))){
				f=true;
			}
			return f;
		}
		public boolean contain(Circle circle){
			boolean f=false;
			if(radius-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))>0){
				f=true;
			}
			return f;
		}
		public  boolean overlaps(Circle circle){
			boolean f=false;
			if((radius+circle.getRadius())-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))>0
					&&Math.max(radius,circle.getRadius())-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))<0){
				f=true;
			}
			return f;
		}
	public String toString(){
	return "Ô²ÐÄ("+x+","+y+")"+"°ë¾¶"+	radius;
	}
	}
