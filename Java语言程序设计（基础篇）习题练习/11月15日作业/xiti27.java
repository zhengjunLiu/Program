import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;
public class xiti27 {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	     System.out.print("（输入10个数）数组1");
	     int []a = new int[10];
	     int []b = new int[10];
	     int i=0,j=0;
	    
	while(i!=10){
		a[i]=input.nextInt();
		i++;
		 
	}
	     System.out.print("（输入10个数）数组2");  
	      
		while(j!=10){
			b[j]=input.nextInt();
			j++;
			}
		 System.out.print(bijiao(a,b));
	  
	}
public static boolean bijiao(int []list1,int []list2){
	boolean y=java.util.Arrays.equals(list1, list2);
	return y;
}
}
