
public class Circle2D {

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
		public Circle2D(){
			x=0;
			y=0;
			radius=1;
		}
		public Circle2D(double a,double b,double c){
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
		public boolean contain(Circle2D circle){
			boolean f=false;
			if(radius-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))>0){
				f=true;
			}
			return f;
		}
		public  boolean overlaps(Circle2D circle){
			boolean f=false;
			if((radius+circle.getRadius())-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))>0
					&&Math.max(radius,circle.getRadius())-Math.sqrt((circle.getY()*circle.getY()-y*y)/(circle.getX()*circle.getX()-x*x))<0){
				f=true;
			}
			return f;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D cir1=new Circle2D(2,2,5.5);
		System.out.println("圆1面积="+cir1.getArea());
		System.out.println("圆1周长="+cir1.getPerimeter());
        if(cir1.contain(3, 3))
        	System.out.println("点(3,3)在圆1内");
        else
        	System.out.println("点(3.3)不在圆1内");
        if(cir1.contain(new Circle2D(4,5,10.5)))
        	 System.out.println("圆 2在圆1内");
          else
             	System.out.println("圆 2不在圆1内");   	
        if(cir1.overlaps(new Circle2D(3,5,2.3)))
        	System.out.println("圆 3与圆1相交");
        else
        	System.out.println("圆 3与圆1不相交");
	}
}
