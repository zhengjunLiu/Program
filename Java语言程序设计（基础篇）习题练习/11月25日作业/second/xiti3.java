package second;

import java.util.Scanner;

public class xiti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []a=new int [100];
      for(int i=0;i<100;i++)a[i]=(int) ((Math.random()*1000)%10);
      Scanner input=new Scanner(System.in);
      System.out.print("输入数组下标");
      try{
    	  int b=input.nextInt();
    	  System.out.println(a[b]);
      }catch(ArrayIndexOutOfBoundsException c){
    	  System.out.print("out of bounds");
      }
	}

}
