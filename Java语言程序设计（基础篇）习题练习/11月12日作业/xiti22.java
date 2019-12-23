import java.util.Scanner;
public class xiti22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("输入 点坐标：");
	     Scanner input=new Scanner(System.in);
	     double x=input.nextDouble();
	     double y=input.nextDouble();
	     double length=Math.sqrt(y*y+x*x);
	     if(length>10)
	    	 System.out.println("点在圆外：");
	     else
	    	 if(length==10)
	    		 System.out.println("点在圆上：");
	    	 else
	    		 System.out.println("点在圆内：");
	    	 
    
	}

}
