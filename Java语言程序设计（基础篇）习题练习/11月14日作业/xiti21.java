import java.util.Scanner;

public class xiti21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner input=new Scanner(System.in);
		 
		    System.out.println("输入10个数");
		    double []a=new double[10];
		    int i;
		    for( i=0;i<10;i++)a[i]=input.nextDouble();
		    double max=0,max2=0;
		    for(i=0;i<10;i++)
		    	{
		    	max+=a[i];
		    	max2+=a[i]*a[i];
		    	}
		    double mean=max/10;
		    double deviation=Math.sqrt((max2-(max*max)/10)/9);
		    System.out.println("均值="+mean+"标准差="+deviation);
	}

}
