		import java.util.Scanner;
public class xiti46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner (System.in);
		 System.out.print("输入一个整数"); 
		short i=0;
		short a=input.nextShort();
		short b=a,j;
		 int []c=new int[16];
		 if(a>0){
			 while (b!=0){
				 c[i]=b%2;
				 i++;
				 b= (short) (b/2);
				 }
			 for( j=16;j>i+1;j--)
				 System.out.print("0"); 
			for(j= i;j>=0;j--)System.out.print(c[j]); 	 
			 
		 }
		 else
			   System.out.println(Integer.toBinaryString(a));
		 
			
	}

}
