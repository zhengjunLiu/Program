import java.util.Scanner; 
public class xiti6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		System.out.println("����0��1000֮���һ��������");
		int a=input.nextInt();
		int b=0;
		while (a>0){
			b=b+a%10;
			a=a/10;
		}
		System.out.println("��λ����֮��="+b);	
		
	}

}
