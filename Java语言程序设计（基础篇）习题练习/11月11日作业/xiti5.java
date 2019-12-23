import java.util.Scanner; 
public class xiti5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		System.out.println("输入 费用：");
		double subtotal=input.nextDouble();
		System.out.println("输入 酬金率：");
		double rate=input.nextDouble();
		double gratuity=(rate/100)*subtotal;
		double tatol=gratuity+subtotal;
		System.out.println("酬金："+gratuity+"总费用"+tatol);
		
		
	}

}
