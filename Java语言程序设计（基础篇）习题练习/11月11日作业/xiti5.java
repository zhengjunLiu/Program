import java.util.Scanner; 
public class xiti5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		System.out.println("���� ���ã�");
		double subtotal=input.nextDouble();
		System.out.println("���� ����ʣ�");
		double rate=input.nextDouble();
		double gratuity=(rate/100)*subtotal;
		double tatol=gratuity+subtotal;
		System.out.println("���"+gratuity+"�ܷ���"+tatol);
		
		
	}

}
