import java.util.Scanner; 
public class xiti6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		System.out.println("输入0到1000之间的一个整数：");
		int a=input.nextInt();
		int b=0;
		while (a>0){
			b=b+a%10;
			a=a/10;
		}
		System.out.println("各位数字之和="+b);	
		
	}

}
