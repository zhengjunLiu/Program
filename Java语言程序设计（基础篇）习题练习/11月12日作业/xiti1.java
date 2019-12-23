import java.util.Scanner;
public class xiti1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double a,b,c;
     
     System.out.println("ÊäÈë  a,b,c£º");
     Scanner input=new Scanner(System.in);
     a=input.nextDouble();
     b=input.nextDouble();
     c=input.nextDouble();
     double d=Math.sqrt(b*b-4*a*c);
     if(d>=0){
    	double x1= (-b+d)/2*a;
    	double x2=(-b-d)/2*a;
    	 System.out.println("x1=£º"+x1+"x2="+x2);
     }
     else
    	 System.out.println("ÎÞ½â£º");
	}

}
