import java.util.Scanner;
public class xiti22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("���� �����꣺");
	     Scanner input=new Scanner(System.in);
	     double x=input.nextDouble();
	     double y=input.nextDouble();
	     double length=Math.sqrt(y*y+x*x);
	     if(length>10)
	    	 System.out.println("����Բ�⣺");
	     else
	    	 if(length==10)
	    		 System.out.println("����Բ�ϣ�");
	    	 else
	    		 System.out.println("����Բ�ڣ�");
	    	 
    
	}

}
