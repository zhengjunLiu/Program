package second;

public class Triangle extends GeometricObject {
   public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
   private double side1;
   private double side2;
   private double side3;
	public Triangle(){
		super();
		side1=1;
		side2=1;
		side2=1;
   }
	public Triangle(String color1,boolean filled1,double a1,double a2,double a3) throws IllegalaTrangleException{
		super(color1,filled1);
		
		if(a1+a2<=a3||a1+a3<=a2||a2+a3<=a1)
			throw new  IllegalaTrangleException();
		else
			{side1=a1;
		     side2=a2;
		     side3=a3;
			}
   }
	public double getArea(){
		 double s=(side1+side2+side3)/2;
		 double area;
		 area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		 return area;
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}
	public String toString(){
		return "Triangle : side1="+side1+"side2="+side2+"side3="+side3;
	}
	

}
