
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
		 System.out.println("��="+width+"��="+height);
		 System.out.println("���="+getArae());
		 System.out.println("�ܳ�="+getPerimeter());
		 
	 }

	public static void main(String[] args) {
		rectangle a=new rectangle(4,40);
		rectangle b=new rectangle(3.5,35.9);
		 System.out.println("����1");
        a.display();
        System.out.println("����2");
        b.display();
        
    
	
	}

}
