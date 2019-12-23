import java.util.Scanner;
public class MyTriangle {

	/**
	 * @param args
	 */
	  
	  public static boolean isVaild(double bian1,double bian2,double bian3){
		 boolean y=true;
		  if((bian1+bian2<=bian3)||(bian1+bian3<=bian2)||(bian3+bian2<=bian1)){
			  y=false;
			  
		  }
		  return y;
		  
	  }
	  public static double area (double bian1,double bian2,double bian3){
		  double side,mian;
		  side=(bian1+bian2+bian3)/2;
		  mian=Math.sqrt(side*(side-bian1)*(side-bian2)*(side-bian3));
		  return mian;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		    System.out.println("输入边");
		    double a=input.nextDouble();
		    double b=input.nextDouble();
		    double c=input.nextDouble();
		    if(MyTriangle.isVaild(a, b, c)){
		    	 System.out.println("面积="+MyTriangle.area(a, b, c));
		    }
		    else
		    	 System.out.println("构不成三角形");
    
	}

}
