package jixun8;
import java.awt.*;
import java.awt.geom.Line2D;
public class Triangle2D {
  public Mypoint getP1() {
		return p1;
	}
	public void setP1(Mypoint p1) {
		this.p1 = p1;
	}
	public Mypoint getP2() {
		return p2;
	}
	public void setP2(Mypoint p2) {
		this.p2 = p2;
	}
	public Mypoint getP3() {
		return p3;
	}
	public void setP3(Mypoint p3) {
		this.p3 = p3;
	}
private Mypoint p1;
  private Mypoint p2;
  private Mypoint p3;
  public Triangle2D(){

	  p1=new Mypoint(0,0);
	  p2=new Mypoint(1,1);
	  p3=new Mypoint(2,5);
	  }
  public Triangle2D(Mypoint a1,Mypoint a2,Mypoint a3){
	p1=a1;
	p3=a2;
	p2=a3;
  }
  public double getArea(){
	  double side,s;
	  double side1=p1.distance(p2);
	  double side2=p1.distance(p3);
	  double side3=p2.distance(p3);
	  side=(side1+side2+side3)/2;
	  s=Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
	  return s;
  }
  public double getPerimeter(){
	  double s;
	  double side1=p1.distance(p2);
	  double side2=p1.distance(p3);
	  double side3=p2.distance(p3);
	  s=side1+side2+side3;
	  return s;

  }
public boolean contains(Mypoint p){
	double k1,k2,k3;
	k1=(p1.getY()-p2.getY())/(p1.getX()-p2.getX());
	k2=(p2.getY()-p3.getY())/(p2.getX()-p3.getX());
	k3=(p1.getY()-p3.getY())/(p1.getX()-p3.getX());
	if(k1*p.getX()+p1.getY()-k1*p1.getX()<p.getY())
		if(k2*p.getX()+p2.getY()-k2*p2.getX()<p.getY())
			if(k3*p.getX()+p3.getY()-k3*p3.getX()>p.getY())return true;
		
	 return false;
}
public boolean contains(Triangle2D t ){
	if(contains(t.getP1())&&contains(t.getP2())&&contains(t.getP3()))return true;
	else
		return false;
	
}
public boolean overlaps(Triangle2D t ){
	boolean y1=Line2D.linesIntersect(p1.getX(), p1.getY(),p2.getX(),p2.getY(),t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY());
	boolean y2=Line2D.linesIntersect(p1.getX(), p1.getY(),p2.getX(),p2.getY(),t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY());
	boolean y3=Line2D.linesIntersect(p1.getX(), p1.getY(),p2.getX(),p2.getY(),t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY());
	boolean y4=Line2D.linesIntersect(p1.getX(), p1.getY(),p3.getX(),p3.getY(),t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY());
	boolean y5=Line2D.linesIntersect(p1.getX(), p1.getY(),p3.getX(),p3.getY(),t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY());
	boolean y6=Line2D.linesIntersect(p1.getX(), p1.getY(),p3.getX(),p3.getY(),t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY());
	boolean y7=Line2D.linesIntersect(p3.getX(), p3.getY(),p2.getX(),p2.getY(),t.getP1().getX(), t.getP1().getY(), t.getP2().getX(), t.getP2().getY());
	boolean y8=Line2D.linesIntersect(p3.getX(), p3.getY(),p2.getX(),p2.getY(),t.getP1().getX(), t.getP1().getY(), t.getP3().getX(), t.getP3().getY());
	boolean y9=Line2D.linesIntersect(p3.getX(), p3.getY(),p2.getX(),p2.getY(),t.getP3().getX(), t.getP3().getY(), t.getP2().getX(), t.getP2().getY());
	if(y1||y2||y3||y4||y5||y6||y7||y8||y9)return true;
	else
		return false;
	
}
public static void main(String[] args) {
	Triangle2D t1=new Triangle2D(new Mypoint(2.5,2), new Mypoint(4.2,3) , new Mypoint(5,3.5));
	
	System.out.printf("周长：%5.2f\n",t1.getPerimeter());
	System.out.printf("面积:%5.2f\n",t1.getArea());
	boolean y=t1.contains(new Mypoint(3,3));
	System.out.print("点（3,3）是否在三角形1内？");
	System.out.println(y);
	y=t1.contains(new Triangle2D(new Mypoint(2.9,2), new Mypoint(4,1) , new Mypoint(1,3.4) ));
	System.out.print("三角形2是否在三角形1内？");
	System.out.println(y);
	y=t1.overlaps(new Triangle2D(new Mypoint(2,5.5), new Mypoint(4,-3) , new Mypoint(2,6.5) ));
	System.out.print("三角形3是否和三角形1重叠？");
	System.out.println(y);
}

}
