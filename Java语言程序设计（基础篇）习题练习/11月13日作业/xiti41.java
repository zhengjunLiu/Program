import java.util.Scanner;
public class xiti41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    Scanner input = new Scanner (System.in);
	 System.out.print("输入数（0为结束标志符)"); 
	 
	 int count=1;
	 int max=input.nextInt();
	 int x=1;
	 while(x!=0){
		 x=input.nextInt();
		 if(x>max){
			 max=x;
			 count=1;
		 }
		 else
			 if(x==max)count++;
		
		 }
	 System.out.print("最大的数是"+max+"\n出现了"+count+"次"); 
	 
    
	}

}
