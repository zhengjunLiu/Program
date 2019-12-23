import java.util.Scanner;
public class xiti25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入  三条边长");
	     Scanner input=new Scanner(System.in);
	     double[]a=new double[4];
	     a[1]=input.nextDouble();
	     a[2]=input.nextDouble();
	     a[3]=input.nextDouble();
	     boolean y=true;
	     if(a[1]+a[2]<=a[3])y=false;
	     if(a[1]+a[3]<=a[2])y=false;
	     if(a[2]+a[3]<=a[1])y=false;
	     if(y){
	    	 a[0]=a[1]+a[2]+a[3];
	    	  System.out.println("周长="+a[0]);
	     }
	     else
	    	 System.out.println("不合法");
	    	
	    	 
	    	 
	     
	     
	}

}
