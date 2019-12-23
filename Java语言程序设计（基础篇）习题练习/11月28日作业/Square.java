
public class Square extends GeometricObject implements Colorable{
   public Square(){
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square a=new Square();
    System.out.println(a.howtocolor());
	}

	@Override
	public String howtocolor() {
		// TODO Auto-generated method stub
		return "Color all four sides";
	}

}
