
public class rectangle {

	 private  double width;
	 private  double height;
	 rectangle(){
		 width=1;
		 height=1;
	 }
	 rectangle(double a,double b){
		 width=a;
		 height=b;
	 }
	 public double getArae(){
		 return width*height;
	 }
	 public double getPerimeter(){
		 return (width+height)*2;
	 }
	 public void display(){
		 System.out.println("宽="+width+"高="+height);
		 System.out.println("面积="+getArae());
		 System.out.println("周长="+getPerimeter());
		 
	 }

	public static void main(String[] args) {
		rectangle a=new rectangle(4,40);
		rectangle b=new rectangle(3.5,35.9);
		 System.out.println("矩形1");
        a.display();
        System.out.println("矩形2");
        b.display();
        
    
	
	}

}
