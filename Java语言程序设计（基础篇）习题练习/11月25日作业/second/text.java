package second;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a=new String[2];
		int []b=new int[2];
      Scanner input=new Scanner(System.in);
      try{
    	  System.out.print("输入两个数：");
    	  a[0]=input.next();
    	  a[1]=input.next();
    	  b[0]=Integer.parseInt(a[0]);
    	  b[1]=Integer.parseInt(a[1]);
    	  
      }catch(NumberFormatException c){
    	  System.out.println(c.toString());
    	  System.out.println("重新输入");
    	  a[0]=input.next();
    	  a[1]=input.next();
    	  b[0]=Integer.parseInt(a[0]);
    	  b[1]=Integer.parseInt(a[1]);
    	
    	}
      int sum;
      sum=b[0]+b[1];
      System.out.println(a[0]+" + "+a[1]+"="+sum);

  }	
	
}
