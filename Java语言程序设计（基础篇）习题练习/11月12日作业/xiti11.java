import java.util.Scanner;
public class xiti11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("������ݣ�");
		     Scanner input=new Scanner(System.in);
		     int year =input.nextInt();
		     System.out.println("�����·ݣ�");
		     int mouth=input.nextInt();
		     int []a={0,31,28,31,30,31,30,31,31,30,31,30,31};
		     boolean y=true;
		     if(year%4==0){
		    	 if(year%100==0){
		    		 if(year%400==0)
		    			 y=true;
		    		 else
		    			 y=false;
		    		 
		    		 
		    	 }
		    	 else
		    		 y=true;
		    	
		     }
		     else
		    	 y=false;
		     if(y)a[2]=29;
		     System.out.println(year+"��"+mouth+"��"+"��"+a[mouth]+"��");
		     
	}

}
