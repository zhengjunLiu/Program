import java.util.Scanner;
public class xiti25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	     System.out.print("输入一元二次方程的系数a,b,c");
	     double []a=new double [3];
	     a[0]=input.nextDouble();
	     a[1]=input.nextDouble();
	     a[2]=input.nextDouble();
	     double []b=new double [2];
	     int data=solveQuadratic(a,b);
	     if(data<0)
	    	 System.out.print("方程无解");
	     else
	    	 if(data==1)
	    		 System.out.print("方程有一个解x1=x2="+b[0]);
	    	 else
	    		 System.out.print("方程有两个解x1="+b[0]+"x2="+b[1]);

	     
	}
	public static int solveQuadratic(double[]eqn,double []roots){
		double side=eqn[1]*eqn[1]-4*eqn[0]*eqn[2];
		if(side<0)return -1;
		else
			{
			roots[0]=(-eqn[1]+Math.sqrt(side))/2*eqn[0];
			roots[1]=(-eqn[1]-Math.sqrt(side))/2*eqn[0];
			}
		if(roots[0]==roots[1])return 1;
		else
			return 2;
	}

}
